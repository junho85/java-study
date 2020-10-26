package webflux;

import json.Person;
import reactor.core.publisher.Mono;

public class WebFluxSample {
    public Mono<Person> getPerson(int id) {
        System.out.println("==== person id: " + id);
        if (id == 1) {
            return Mono.error(RuntimeException::new);
        }
        return Mono.just(Person.builder().lastName("홍").build());
    }
}
