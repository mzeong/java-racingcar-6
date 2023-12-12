package racingcar;

public enum ErrorMessage {
    NAME_IS_EMPTY("이름이 공백입니다."),
    NAME_MAX_LENGTH_EXCEEDED("이름이 최대 길이를 초과했습니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
