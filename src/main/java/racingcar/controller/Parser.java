package racingcar.controller;

import static racingcar.util.ErrorMessage.COUNT_IS_NOT_NUMBER;
import static racingcar.util.ErrorMessage.NAME_IS_EMPTY;

import java.util.Arrays;
import java.util.List;

public class Parser {
    private static final String DELIMITER = ",";

    public static List<String> parseCarNames(String input) {
        List<String> carNames = Arrays.stream(input.split(DELIMITER))
                .map(String::trim)
                .filter(carName -> !carName.isEmpty())
                .toList();
        if (carNames.isEmpty()) {
            throw new IllegalArgumentException(NAME_IS_EMPTY.getMessage());
        }
        return carNames;
    }

    public static int parseAttemptCount(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(COUNT_IS_NOT_NUMBER.getMessage());
        }
    }
}
