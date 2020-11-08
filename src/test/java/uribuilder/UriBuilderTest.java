package uribuilder;

import com.google.common.collect.Maps;
import org.junit.jupiter.api.Test;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

public class UriBuilderTest {
    @Test
    void testUriComponentsBuilder() {
        String uri = UriComponentsBuilder.fromUriString("https://test.com/accounts/{accountId}")
                .buildAndExpand(Map.of("accountId", 123))
                .toString();
        System.out.println(uri);
    }
    @Test
    void testUriComponentsBuilder2() {
        String uri = UriComponentsBuilder.fromUriString("https://test.com/accounts/{accountId}")
                .build(Map.of("accountId", 123))
                .toString();
        System.out.println(uri);
    }
}
