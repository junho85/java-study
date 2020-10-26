package webflux;

import json.Person;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class WebFluxTest {
    @Test
    void test1() {
        WebFluxSample webFluxSample = new WebFluxSample();

        Mono<TestResult> testResult = webFluxSample.getPerson(2)
                .flatMap(person -> webFluxSample.getPerson(1)
                        .map(person2 -> TestResult.builder().message("두번째").build())
                        .onErrorReturn(TestResult.builder().message("두번째 오류").build()))
                .onErrorReturn(TestResult.builder().message("오류").build())
                ;

        System.out.println(testResult.block().getMessage());
    }

    @Test
    void test2() {
        WebFluxSample webFluxSample = new WebFluxSample();

        Mono<TestResult> testResult = webFluxSample.getPerson(1)
                .flatMap(person -> webFluxSample.getPerson(2)
                        .map(person2 -> TestResult.builder().message("두번째").build())
                        .onErrorReturn(TestResult.builder().message("두번째 오류").build()))
                .onErrorReturn(TestResult.builder().message("오류").build())
                ;

        System.out.println(testResult.block().getMessage());
    }

    @Test
    void test3() {
        Mono<Person> map = Mono.just(Mono.error(RuntimeException::new))
                .map(person -> Person.builder().firstName("hello").build())
                .onErrorMap(throwable -> new NullPointerException("test"))
                .map(it -> Person.builder().firstName("end").build());

        Person block = map.block();
        System.out.println("======== hello world");
        System.out.println(block);
    }
}
