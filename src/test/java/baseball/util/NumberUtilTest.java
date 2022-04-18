package baseball.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberUtilTest {
    @Test
    void Numeric일시_true반환() {
        // given
        String input = "123";

        // when
        boolean result = NumberUtil.isNumeric(input);

        // then
        assertThat(result).isEqualTo(true);
    }

    @Test
    void Numeric아닐시_false반환() {
        // given
        String input = "12a";

        // when
        boolean result = NumberUtil.isNumeric(input);

        // then
        assertThat(result).isEqualTo(false);
    }
}
