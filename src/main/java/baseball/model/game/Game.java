package baseball.model.game;

import baseball.constant.Config;

public class Game extends GameConfig {
    private boolean isRunning = true;

    private void end() {
        this.isRunning = false;
    }

    private void run() {
        // 게임 시작
        view.play();
        player.setMode(playMode);
        player.input();
        this.match();
    }

    private void match() {
        // ball, strike 점수 리셋 & 게임결과 출력
        rule.reset();
        rule.compare(computer.getValue(), player.getValue());
        view.output(rule.getStrike(), rule.getBall());

        // allstrkie 체크
        if (rule.isAllStrike()) {
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
        // 새게임시, 새로운 램덤 숫자 생성
        computer.setValue(Config.NUMBER_LENGTH);
    }

    public void play() {
        do {
            this.run();
        } while (this.isRunning);
    }
}
