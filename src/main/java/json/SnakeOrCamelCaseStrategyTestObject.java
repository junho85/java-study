package json;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@JsonNaming(CustomPropertyNamingStrategy.SnakeOrCamelCaseStrategy.class)
public class SnakeOrCamelCaseStrategyTestObject {
    private Long accountId;
    private Boolean allowAds;
}
