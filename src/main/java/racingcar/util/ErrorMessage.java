package racingcar.util;

public enum ErrorMessage {
    NAME_IS_EMPTY("자동차 이름이 없습니다."),
    NAME_LENGTH_OUT_OF_RANGE("자동차 이름이 최대 길이를 초과했습니다."),
    COUNT_IS_NOT_NUMBER("시도할 횟수가 숫자가 아닙니다."),
    COUNT_OUT_OF_RANGE("시도할 횟수가 최소값보다 작습니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
