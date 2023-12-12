package racingcar.domain;

public class Car {
    private static final String DASH = "-";
    private static final int START_DISTANCE = 0;
    private static final int FORWARD_CONDITION = 4;
    private static final int FORWARD_DISTANCE = 1;
    private final Name name;
    private int distance;

    public Car(Name name) {
        this.name = name;
        this.distance = START_DISTANCE;
    }

    public void moveOnCondition(int randomNumber) {
        if (isForward(randomNumber)) {
            distance += FORWARD_DISTANCE;
        }
    }

    private boolean isForward(int value) {
        return value >= FORWARD_CONDITION;
    }

    @Override
    public String toString() {
        return name + " : " + DASH.repeat(distance);
    }
}
