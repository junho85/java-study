package json;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String firstName;
    private String lastName;
    private String byName;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phoneNumber;
}
