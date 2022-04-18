package baseball.model.rule;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RuleTest {
    @Test
    @DisplayName("123과 456 비교시, 겹치는 숫자가 없으므로 결과는 스트라이크0 볼0이다.")
    void rule_스트라이크0_볼0() {
        // given
        Rule rule = new Rule();

        // when
        rule.compare("123", "456");

        // then
        assertThat(rule.getStrike()).isEqualTo(0);
        assertThat(rule.getBall()).isEqualTo(0);
    }

    @Test
    @DisplayName("123과 123 비교시, 모두 겹치므로 결과는 스트라이크3 이다.")
    void rule_스트라이크3_볼0() {
        // given
        Rule rule = new Rule();

        // when
        rule.compare("123", "123");

        // then
        assertThat(rule.getStrike()).isEqualTo(3);
        assertThat(rule.getBall()).isEqualTo(0);
    }

    @Test
    @DisplayName("123과 231 비교시, 겹치긴하나 index위치가 다르므로 볼3 이다.")
    void rule_스트라이크0_볼3() {
        // given
        Rule rule = new Rule();

        // when
        rule.compare("123", "231");

        // then
        assertThat(rule.getStrike()).isEqualTo(0);
        assertThat(rule.getBall()).isEqualTo(3);
    }

    @Test
    @DisplayName("123과 321 비교시, 중간위치만 겹치고 다른곳은 index위치가 다르므로 스트라이크1 볼2 이다.")
    void rule_스트라이크1_볼2() {
        // given
        Rule rule = new Rule();

        // when
        rule.compare("123", "321");

        // then
        assertThat(rule.getStrike()).isEqualTo(1);
        assertThat(rule.getBall()).isEqualTo(2);
    }
}
