package racingcar.domain;

import static racingcar.util.ErrorMessage.NAME_LENGTH_OUT_OF_RANGE;

public class Name {
    private static final int MAX_LENGTH = 5;
    private final String name;

    public Name(String name) {
        validateMaxLength(name);
        this.name = name;
    }

    private void validateMaxLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(NAME_LENGTH_OUT_OF_RANGE.getMessage());
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
