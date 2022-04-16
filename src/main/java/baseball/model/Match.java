package baseball.model;

public class Rule {
    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void reset() {
        this.strike = 0;
        this.ball = 0;
    }

    public void compare(String computer, String user) {
        for (int i = 0; i < computer.length(); i++) {
            this.countStrike(computer.charAt(i), user.charAt(i));
            this.countBall(computer.indexOf(String.valueOf(user.charAt(i))), i);
        }
    }

    private void loop(int i) {
        
    }

    private void countStrike(char a, char b) {
        if (a == b) {
            this.strike++;
        }
    }

    private void countBall(int index, int number) {
        if (index != -1 && index != number) {
            this.ball++;
        }
    }
}
