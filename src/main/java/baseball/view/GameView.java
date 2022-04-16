package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class View {

    public String play() {
        String input = Console.readLine();
        System.out.println(input);
        return input;
    }
}
