package baseball.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ComputerTest {
    @Test
    void 랜덤_숫자생성() {
        // given
        Computer computer = new Computer();

        // when
        String str = computer.generateValue(3);

        // then
        assertThat(str.length()).isEqualTo(3);
    }
}
