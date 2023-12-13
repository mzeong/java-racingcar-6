package racingcar.view;

public enum Message {
    INPUT_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_ATTEMPT_COUNT("시도할 회수는 몇회인가요?"),
    OUTPUT_RESULT_HEADER("실행 결과"),
    OUTPUT_WINNERS("최종 우승자 : %s");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getFormattedMessage(final String value) {
        return String.format(message, value);
    }
}
