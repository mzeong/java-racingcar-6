package racingcar.domain;

import racingcar.util.RandomNumberGenerator;

public class Car {
    private static final String DASH = "-";
    private static final int START_DISTANCE = 0;
    private static final int FORWARD_CONDITION = 4;
    private static final int FORWARD_DISTANCE = 1;
    private static final String SEPARATOR = " : ";
    private final Name name;
    private int distance;
    private final RandomNumberGenerator randomNumberGenerator;

    public Car(Name name, RandomNumberGenerator randomNumberGenerator) {
        this.name = name;
        this.distance = START_DISTANCE;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void moveOnCondition() {
        int randomNumber = randomNumberGenerator.generate();
        if (isForward(randomNumber)) {
            distance += FORWARD_DISTANCE;
        }
    }

    private boolean isForward(int value) {
        return value >= FORWARD_CONDITION;
    }

    @Override
    public String toString() {
        return name + SEPARATOR + DASH.repeat(distance);
    }
}
