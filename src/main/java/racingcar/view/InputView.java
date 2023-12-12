package racingcar.view;

import static racingcar.view.Message.INPUT_ATTEMPT_COUNT;
import static racingcar.view.Message.INPUT_CAR_NAMES;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String inputCarNames() {
        printMessage(INPUT_CAR_NAMES);
        return Console.readLine();
    }

    public static String inputAttemptCount() {
        printMessage(INPUT_ATTEMPT_COUNT);
        return Console.readLine();
    }

    private static void printMessage(Message message) {
        System.out.println(message.getMessage());
    }
}
