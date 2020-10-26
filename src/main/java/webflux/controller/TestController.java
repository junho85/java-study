package webflux.controller;

import json.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;
import webflux.WebFluxSample;

@RestController
public class TestController {
    @GetMapping("/test")
    public Mono<Person> getPerson() {
        WebFluxSample webFluxSample = new WebFluxSample();
        return webFluxSample.getPerson(1);
    }
}
