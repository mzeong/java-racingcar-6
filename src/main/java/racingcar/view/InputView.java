package racingcar.view;

import static racingcar.view.Message.INPUT_CAR_NAMES;
import static racingcar.view.Message.INPUT_NUMBER_OF_ATTEMPTS;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputCarNames() {
        printMessage(INPUT_CAR_NAMES);
        return Console.readLine();
    }

    public static String inputNumberOfAttempts() {
        printMessage(INPUT_NUMBER_OF_ATTEMPTS);
        return Console.readLine();
    }

    private static void printMessage(Message message) {
        System.out.println(message.getMessage());
    }
}
