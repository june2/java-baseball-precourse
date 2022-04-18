package baseball.model.player;

import baseball.constant.Config;
import baseball.util.NumberUtil;
import camp.nextstep.edu.missionutils.Console;

public class PlayMode implements GameState {

    String validateInput(String input) {
        if (!NumberUtil.isNumeric(input) || input.length() != Config.NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    @Override
    public String input() {
        return validateInput(Console.readLine());
    }
}
