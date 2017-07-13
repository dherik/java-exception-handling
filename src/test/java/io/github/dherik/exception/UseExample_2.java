package io.github.dherik.exception;

import io.github.dherik.exception.ErrorCode;
import io.github.dherik.exception.SystemException;
import org.junit.Test;

public class UseExample_2 {

    private static final int MIN_LENGTH = 10;

    @Test(expected = SystemException.class)
    public void test() {

        String value = "email";
        String field = "abc";

        if (value == null || value.length() < MIN_LENGTH) {
            throw new SystemException(ErrorCode.VALUE_TOO_SHORT)
                    .set("field", field)
                    .set("value", value)
                    .set("min-length", MIN_LENGTH);
        }

    }
}
