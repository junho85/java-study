package webflux;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestResult {
    private String message;
}
