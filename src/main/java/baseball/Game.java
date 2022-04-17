package baseball;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.Rule;
import baseball.view.ConsoleView;

public class Game {
    private boolean isRunning = true;
    private Player player = new Player();
    private Computer computer = new Computer();
    private Rule rule = new Rule();
    private ConsoleView view = new ConsoleView();

    private void end() {
        this.isRunning = false;
    }

    private void run() {
        view.play();
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
        player.input();
        if (player.getValue().equals("2")) {
            this.end();
        }
        computer.setValue(3);
    }

    public void play() {
        do {
            this.run();
        } while (this.isRunning);
    }
}
