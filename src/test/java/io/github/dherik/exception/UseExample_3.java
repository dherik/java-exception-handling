package io.github.dherik.exception;

import io.github.dherik.exception.ErrorCode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ResourceBundle;

public class UseExample_3 {

    private String getUserText(ErrorCode errorCode) {
        String key = errorCode.getClass().getSimpleName() + "__" + errorCode;
        ResourceBundle bundle = ResourceBundle.getBundle("exceptions");
        return bundle.getString(key);
    }

    @Test
    public void test() {
        Assert.assertEquals("Value is too short", getUserText(ErrorCode.VALUE_TOO_SHORT));
    }

}
