package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    private String value;

    public String getValue() {
        return value;
    }

    public String generateValue(int size) {
        StringBuilder value = new StringBuilder();

        for (int i = 0; i < size; i++) {
            value.append(Randoms.pickNumberInRange(1, 9));
        }

        return value.toString();
    }
}
