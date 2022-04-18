package baseball.model.rule;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RuleTest {
    @Test
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
