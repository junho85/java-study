package net;

import com.google.common.net.UrlEscapers;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URIUtils;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class URLTest {
    @Test
    public void test() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        final String encodeString = " & ";

//        String encodedString = URLEncoder.encode(encodeString, "UTF-8");
        String encodedString = URLEncoder.encode(encodeString, StandardCharsets.UTF_8.toString()).replace("+", "%20");
        System.out.println(encodedString);

        String encodedString2 = UrlEscapers.urlFragmentEscaper().escape(encodeString);
        System.out.println(encodedString2);

        String urlStr = "http://abc.dev.domain.com/0007AC/ads/800x480 15sec h.264.mp4";
        URL url = new URL(urlStr);
        URI uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        url = uri.toURL();

        System.out.println(url);



//        String decodedString = URLDecoder.decode(encodedString, "UTF-8");
//        String decodedString = UrlEscapers.urlFragmentEscaper().es
//        System.out.println(decodedString);
    }

    @Test
    public void test2() throws URISyntaxException {
        String testUrl = "http://www.baeldung.com?key1=value+1&key2=value%40%21%242&key3=value%253";

        URI uri = new URI(testUrl);

        System.out.println(uri);
        System.out.println(uri.getRawQuery());

    }

    @Test
    public void test3() throws UnsupportedEncodingException, URISyntaxException {
        final String query = "abc=hello world";
        URIBuilder builder = new URIBuilder()
                .setParameter("helo", "hello world");

        System.out.println(builder.build());
//        final String encodedString = URLEncoder.encode(query, "UTF-8");
//        URIUtils.que
//        final String encodedString = URIUtils.encodeQuery(query);
//        System.out.println(encodedString);
    }

//    private String encodeValue(String value) {
//        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
//    }
//
//    @Test
//    public void givenRequestParam_whenUTF8Scheme_thenEncode() throws Exception {
//
//        String testUrl = "http://www.baeldung.com?key1=value+1&key2=value%40%21%242&key3=value%253";
//
//        Map<String, String> requestParams = new HashMap<>();
//        requestParams.put("key1", "value 1");
//        requestParams.put("key2", "value@!$2");
//        requestParams.put("key3", "value%3");
//
//        String encodedURL = requestParams.keySet().stream()
//                .map(key -> key + "=" + encodeValue(requestParams.get(key)))
//                .collect(joining("&", "http://www.baeldung.com?", ""));
//
//        assertThat(testUrl, is(encodedURL));
//    }
}
