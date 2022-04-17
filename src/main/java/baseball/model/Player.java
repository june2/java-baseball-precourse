package baseball.model;

import camp.nextstep.edu.missionutils.Console;

public class Player {
    private String value;

    public String getValue() {
        return value;
    }

    public void input() {
        String input = Console.readLine();
        System.out.println(input);
        this.value = input;
    }
}
