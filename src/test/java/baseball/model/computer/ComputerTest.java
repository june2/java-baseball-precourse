package baseball.model.computer;

import baseball.constant.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ComputerTest {
    @Test
    @DisplayName("입력된 자릿수에 맞추어서, 랜덤자릿수를 만들어낸다.")
    void 랜덤_숫자생성() {
        // given
        Computer computer = new Computer();

        // when
        computer.setValue(Config.NUMBER_LENGTH);

        // then
        assertThat(computer.getValue().length()).isEqualTo(Config.NUMBER_LENGTH);
    }
}
