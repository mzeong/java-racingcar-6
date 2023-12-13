package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.util.RandomNumberGenerator;

public class Cars {
    private static final String DELIMITER = "\n";
    private final List<Car> cars;

    public Cars(List<Name> carNames) {
        this.cars = carNames.stream()
                .map(name -> new Car(name, new RandomNumberGenerator()))
                .toList();
    }

    public void moveAll() {
        cars.forEach(Car::moveOnCondition);
    }

    public List<String> getCarNamesWithMaxDistance() {
        Car maxCar = getCarWithMaxDistance();
        return cars.stream()
                .filter(car -> car.isSameDistance(maxCar))
                .map(Car::toNameString)
                .toList();
    }

    private Car getCarWithMaxDistance() {
        return cars.stream()
                .max(Car::compareTo)
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public String toString() {
        return cars.stream()
                .map(Car::toString)
                .collect(Collectors.joining(DELIMITER));
    }
}
