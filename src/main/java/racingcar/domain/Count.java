package racingcar.domain;

import static racingcar.ErrorMessage.COUNT_OUT_OF_RANGE;

public class Count {
    private static final int MIN_NUMBER = 1;
    private final int count;

    public Count(int count) {
        validateRange(count);
        this.count = count;
    }

    private void validateRange(int count) {
        if (count < MIN_NUMBER) {
            throw new IllegalArgumentException(COUNT_OUT_OF_RANGE.getMessage());
        }
    }

    public int getCount() {
        return count;
    }
}
