package com.genius.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/max")
public class MaxController {

    @RequestMapping
    public Mono<String> lsa() {
        return Mono.just("max deu certo");
    }

}
