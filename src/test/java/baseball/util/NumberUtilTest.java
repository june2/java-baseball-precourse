package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberUtilTest {
    @Test
    @DisplayName("input값이 numeric일시 true 반환한다.")
    void Numeric일시_true반환() {
        // given
        String input = "123";

        // when
        boolean result = NumberUtil.isAllowNumeric(input);

        // then
        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("input의 각자리수가 1~9사이 숫자가 아닐경우 false 반환한다.")
    void Numeric값이지만_111이하일경우_false반환() {
        // given
        String input = "102";

        // when
        boolean result = NumberUtil.isAllowNumeric(input);

        // then
        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("input값이 numeric이 아닐시 false 반환한다.")
    void Numeric아닐시_false반환() {
        // given
        String input = "12a";

        // when
        boolean result = NumberUtil.isAllowNumeric(input);

        // then
        assertThat(result).isEqualTo(false);
    }
}
