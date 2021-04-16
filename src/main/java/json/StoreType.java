package json;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

public enum StoreType {
    APPLE,
    GOOGLE,
    @JsonEnumDefaultValue UNKNOWN;
}
