package racingcar;

import static racingcar.ErrorMessage.NAME_MAX_LENGTH_EXCEEDED;

public class Name {
    private static final int MAX_LENGTH = 5;
    private final String name;

    Name(String name) {
        validateMaxLength(name);
        this.name = name;
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
