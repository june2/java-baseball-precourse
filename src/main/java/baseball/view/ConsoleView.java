package baseball.view;

import baseball.constant.Message;

public class ConsoleView {

    private String generateOutput(int strike, int ball) {
        if (ball == 0 && strike > 0) {
            return strike + Message.STRIKE;
        }
        if (ball > 0 && strike == 0) {
            return ball + Message.BALL;
        }
        if (ball > 0 && strike > 0) {
            return ball + Message.BALL + " " + strike + Message.STRIKE;
        }
        return Message.NOTHING;
    }

    public void output(int strike, int ball) {
        System.out.println(this.generateOutput(strike, ball));
    }

    public void play() {
        System.out.print(Message.PLAY);
    }

    public void replay() {
        System.out.println(Message.REPLAY);
    }

    public void end() {
        System.out.println(Message.END);
    }
}
