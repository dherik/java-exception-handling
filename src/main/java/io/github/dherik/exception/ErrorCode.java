package io.github.dherik.exception;

public enum ErrorCode implements IErrorCode {

    INVALID_NAME(101),
    ORDER_NOT_FOUND(102),
    CREDIT_CARD_EXPIRED(103),
    VALUE_TOO_SHORT(104);

    private final int number;

    private ErrorCode(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

}
