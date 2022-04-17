package baseball.view;

import baseball.constant.Message;

public class ConsoleView {
    public void play() {
        System.out.print(Message.PLAY);
    }

    public void replay() {
        System.out.print(Message.REPLAY);
    }

    public void end() {
        System.out.print(Message.END);
    }
}
