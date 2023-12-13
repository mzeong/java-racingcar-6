package racingcar.domain;

import racingcar.util.RandomNumberGenerator;

public class Car implements Comparable<Car> {
    private static final int FORWARD_CONDITION = 4;
    private static final String SEPARATOR = " : ";
    private final Name name;
    private final Distance distance;
    private final RandomNumberGenerator randomNumberGenerator;

    public Car(Name name, RandomNumberGenerator randomNumberGenerator) {
        this.name = name;
        this.distance = new Distance();
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void moveOnCondition() {
        int randomNumber = randomNumberGenerator.generate();
        if (isForward(randomNumber)) {
            distance.increase();
        }
    }

    private boolean isForward(int value) {
        return value >= FORWARD_CONDITION;
    }

    @Override
    public String toString() {
        return name + SEPARATOR + distance;
    }

    public String toNameString() { return name.toString(); }

    @Override
    public int compareTo(Car o) {
        return distance.compareTo(o.distance);
    }

    public boolean isSameDistance(Car o) {
        return distance.equals(o.distance);
    }
}
