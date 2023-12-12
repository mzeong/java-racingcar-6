package racingcar;

import static racingcar.ErrorMessage.NAME_IS_EMPTY;
import static racingcar.ErrorMessage.NAME_MAX_LENGTH_EXCEEDED;

public class Name {
    private static final int MAX_LENGTH = 5;
    private final String name;

    Name(String name) {
        validateNotEmpty(name);
        validateMaxLength(name);
        this.name = name;
    }

    private void validateNotEmpty(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(NAME_IS_EMPTY.getMessage());
        }
    }

    private void validateMaxLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(NAME_MAX_LENGTH_EXCEEDED.getMessage());
        }
    }

    public String getName() {
        return name;
    }
}
