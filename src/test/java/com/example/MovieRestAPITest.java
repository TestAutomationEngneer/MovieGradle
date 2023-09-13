package com.example;

import com.example.actor.ActorClient;
import com.example.base.TestBase;
import com.example.model.Actor;
import com.example.model.Movie;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

@MicronautTest
@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MovieRestAPITest extends TestBase {

    @Inject
    EmbeddedServer server;

    @Inject
    ActorClient actorClient;

    @BeforeAll
    public void setup() {
        RestAssured.port = server.getPort();
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI = "http://localhost:9595";
    }

    @Test
    void shouldGetActorFromClient() {
        Actor actualActor = actorClient.getActorById(2L);
        assertThat(actualActor.getFirstName()).isEqualTo("Robercik");
    }

    @Test
    void shouldGetCatchMeIfYouCaMovie() {
        given().log().all()
                .when()
                .get("/movies/5")
                .then()
                .statusCode(200).log().all()
                .body("title", equalTo("Catch Me If You Can"))
                .body("actors", hasSize(2));
    }

    @Test
    void shouldGetLeonardoFromCatchMeIfYouCanMovie() {
        given()
                .when()
                .get("/movies/5")
                .then()
                .statusCode(200).log().all()
                .body("title", equalTo("Catch Me If You Can"))
                .body("actors", hasSize(2))
                .body("actors[0].firstName", equalTo("Leonardo"));
    }

    @Test
    void shouldGetHeatMovie() {
        given()
                .when()
                .get("/movies/2")
                .then()
                .statusCode(200).log().all()
                .body("title", equalTo("Heat"))
                .body("actors", hasSize(1));
    }

    @Test
    void shouldGetRobertFromTitanicMovie() {
        given()
                .when()
                .get("/movies/2")
                .then()
                .statusCode(200).log().all()
                .body("title", equalTo("Heat"))
                .body("actors", hasSize(1))
                .body("actors[0].firstName", equalTo("Robercik"));  //z  @MockBean(ActorClient.class) w TestBase
    }

    @Test
    void shouldNOTSaveMovieWithoutTitle() {
        Movie matrix = new Movie(6L, null, "Bareja", 1999, List.of(1L, 2L), null);
        Response response = given()
                .body(matrix)
                .contentType(ContentType.JSON)
                .when()
                .post("/movies");


        Map<String, Object> responseMap = response.as(Map.class);

        var messages = (Map<String, Object>) responseMap.get("_embedded");
        var errors = (List<Map<String, String>>) messages.get("errors");
        var errorMessage = errors.get(0);
        assertThat(errors.get(0))
                .containsEntry("message", "movie.title: can not be null my friend");
    }
}
