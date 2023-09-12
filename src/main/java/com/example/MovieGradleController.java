package com.example;

import io.micronaut.http.annotation.*;

@Controller("/movieGradle")
public class MovieGradleController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}