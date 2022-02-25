package com.genius.estoque.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @RequestMapping
    @ResponseStatus(code = HttpStatus.OK)
    public Mono<String> sla() {
        return Mono.just("teste deu certo");
    }
}
