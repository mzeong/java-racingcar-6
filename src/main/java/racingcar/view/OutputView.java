package racingcar.view;

import static racingcar.view.InputView.printMessage;
import static racingcar.view.Message.OUTPUT_RESULT_HEADER;
import static racingcar.view.Message.OUTPUT_WINNERS;

import racingcar.domain.Race;

public class OutputView {
    public void printResultHeader() {
        printMessage(OUTPUT_RESULT_HEADER);
    }

    public void printRoundResult(Race race) {
        System.out.println(race);
        System.out.println();
    }

    public void printWinners(String winners) {
        System.out.println(OUTPUT_WINNERS.getFormattedMessage(winners));
    }
}
