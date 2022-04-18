package baseball;

import baseball.constant.Config;
import baseball.model.Computer;
import baseball.model.player.PlayMode;
import baseball.model.player.Player;
import baseball.model.Rule;
import baseball.model.player.ReplayMode;
import baseball.view.ConsoleView;

public class Game {
    private boolean isRunning = true;
    private Player player = new Player();
    private PlayMode playMode = new PlayMode();
    private ReplayMode replayMode = new ReplayMode();
    private Computer computer = new Computer();
    private Rule rule = new Rule();
    private ConsoleView view = new ConsoleView();

    private void end() {
        this.isRunning = false;
    }

    private void run() {
        view.play();
        player.setMode(playMode);
        player.input();
        this.match();
    }

    private void match() {
        rule.reset();
        rule.compare(computer.getValue(), player.getValue());
        view.output(rule.getStrike(), rule.getBall());
        if(rule.isAllStrike()) {
            view.end();
            view.replay();
            this.checkReplay();
        }
    }

    private void checkReplay() {
        player.setMode(replayMode);
        player.input();
        if (player.getValue().equals(Config.END_KEY)) {
            this.end();
        }
        computer.setValue(Config.NUMBER_LENGTH);
    }

    public void play() {
        do {
            this.run();
        } while (this.isRunning);
    }
}
