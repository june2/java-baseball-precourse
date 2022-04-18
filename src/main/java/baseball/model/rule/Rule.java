package baseball.model.rule;


import baseball.constant.Config;

public class Rule {
    private boolean isAllStrike = false;
    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isAllStrike() {
        return isAllStrike;
    }

    public void reset() {
        this.strike = 0;
        this.ball = 0;
        this.isAllStrike = false;
    }

    public void compare(String computer, String user) {
        for (int i = 0; i < computer.length(); i++) {
            this.compare(computer, user, i);
        }
        this.checkAllStrike();
    }

    private void compare(String computer, String user, int i) {
        if (!this.isStrike(computer.charAt(i), user.charAt(i))) {
            this.countBall(computer.indexOf(String.valueOf(user.charAt(i))), i);
        }
    }

    private boolean isStrike(char a, char b) {
        if (a == b) {
            this.strike++;
            return true;
        }
        return false;
    }

    private void countBall(int index, int number) {
        if (index != -1 && index != number) {
            this.ball++;
        }
    }

    private void checkAllStrike() {
        if (this.strike == Config.NUMBER_LENGTH) {
            this.isAllStrike = true;
        }
    }
}
