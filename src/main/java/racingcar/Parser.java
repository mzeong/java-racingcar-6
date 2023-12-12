package racingcar;

import static racingcar.ErrorMessage.NAME_IS_EMPTY;

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
}
