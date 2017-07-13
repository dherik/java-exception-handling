package io.github.dherik.exception;

import io.github.dherik.exception.ErrorCode;
import io.github.dherik.exception.SystemException;
import org.junit.Test;

public class UseExample_1 {

    @Test
    public void test() {
        try {
            throw new SystemException(ErrorCode.CREDIT_CARD_EXPIRED);
        } catch (SystemException e) {
            if (e.getErrorCode() == ErrorCode.CREDIT_CARD_EXPIRED) {
                System.out.println("Credit card expired");
            }
        }
    }

}
