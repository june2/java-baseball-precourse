package baseball.model.player;

import baseball.constant.Config;
import camp.nextstep.edu.missionutils.Console;

public class ReplayMode implements GameState {
    String validateInput(String input) {
        if (!(input.equals(Config.REPLAY_KEY) || input.equals(Config.END_KEY))) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    @Override
    public String input() {
        return validateInput(Console.readLine());
    }
}
