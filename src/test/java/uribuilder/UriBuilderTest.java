package uribuilder;

import org.junit.jupiter.api.Test;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

import static org.assertj.core.api.BDDAssertions.then;

public class UriBuilderTest {
    @Test
    void testUriComponentsBuilder() {
        then(UriComponentsBuilder.fromUriString("https://test.com/accounts/{accountId}")
                .buildAndExpand(Map.of("accountId", 123))
                .toString())
                .isEqualTo("https://test.com/accounts/123");
    }

    @Test
    void testUriComponentsBuilder2() {
        then(UriComponentsBuilder.fromUriString("https://test.com/accounts/{accountId}")
                .build(Map.of("accountId", 123))
                .toString())
                .isEqualTo("https://test.com/accounts/123");
    }

    @Test
    void testUriComponentsBuilder3() {
        String uriString = "https://test.com/accounts/{accountId}/payinfo";
        uriString = uriString.replace("/{accountId}", "");

        then(UriComponentsBuilder.fromUriString(uriString)
                .build(Map.of(
                        "accountId", "123",
                        "nothing", 123))
                .toString())
                .isEqualTo("https://test.com/accounts/payinfo");
    }

}