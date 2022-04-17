package baseball;

import baseball.model.Player;

public class Game {
    private boolean isRunning = true;

    public void end() {
        this.isRunning = false;
    }

    public void play() {
        do {
            System.out.println("play");
            this.end();
        } while (this.isRunning);
    }
}
