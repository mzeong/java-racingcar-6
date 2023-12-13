package racingcar.domain;

public class Race {
    private static final String DELIMITER = ", ";
    private final Cars cars;
    private final Count count;

    public Race(Cars cars, Count count) {
        this.cars = cars;
        this.count = count;
    }

    public void playRound() {
        cars.moveAll();
        count.decrease();
    }

    public boolean isOngoing() {
        return count.isOngoing();
    }

    @Override
    public String toString() {
        return cars.toString();
    }

    public String toWinnerString() {
        return String.join(DELIMITER, cars.getCarNamesWithMaxDistance());
    }
}