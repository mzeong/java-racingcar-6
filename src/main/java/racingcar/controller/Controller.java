package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.domain.Cars;
import racingcar.domain.Count;
import racingcar.domain.Name;
import racingcar.domain.Race;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Controller {
    private final InputView inputView;
    private final OutputView outputView;
    private Race race;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void init() {
        Cars cars = new Cars(getCarNames());
        Count count = getAttemptCount();
        race = new Race(cars, count);

        Console.close();
    }

    private List<Name> getCarNames() {
        List<String> carNames = Parser.parseCarNames(inputView.inputCarNames());
        return carNames.stream()
                .map(Name::new)
                .toList();
    }

    private Count getAttemptCount() {
        int attemptCount = Parser.parseAttemptCount(inputView.inputAttemptCount());
        return new Count(attemptCount);
    }

    public void run() {
        outputView.printResultHeader();
        while (race.isOngoing()) {
            race.playRound();
            outputView.printRoundResult(race);
        }
        outputView.printWinners(race.toWinnerString());
    }
}
