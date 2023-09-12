package com.example.actor;

import com.example.model.Actor;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;

import java.util.List;


@Client(id = "actor")
public interface ActorClient {


    @Get("/actors/{id}")
    //@Retryable
    Actor getActorById(@PathVariable Long id);

    @Get("/actors")
    //@Retryable
    List<Actor> getAllActors();
}


