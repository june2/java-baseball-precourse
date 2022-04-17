package baseball.model;

import camp.nextstep.edu.missionutils.Console;

public class Player {
    private String value;

    public String getValue() {
        return value;
    }

    public void input() {
        this.value = Console.readLine();
    }
}
