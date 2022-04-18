package baseball.model.computer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ComputerTest {
    @Test
    void 랜덤_숫자생성() {
        // given
        Computer computer = new Computer();

        // when
        computer.setValue(3);

        // then
        assertThat(computer.getValue().length()).isEqualTo(3);
    }
}
