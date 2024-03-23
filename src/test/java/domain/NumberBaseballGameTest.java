package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

class NumberBaseballGameTest {
    @RepeatedTest(500)
    @DisplayName("시스템은 게임이 시작되면 1~9사이의 서로 다른 수로 이루어진 3자리 숫자를 생성한다")
    void init() {
        //given
        NumberBaseballGame game = new NumberBaseballGame(new RandomNumberGenerator());

        //when
        game.init();

        //then
        List<Integer> answer = game.getAnswer();

        assertThat(answer.size()).isEqualTo(3);

        for (int number : answer) {
            assertThat(number).isBetween(1, 9);
        }

        Set<Integer> numberSet = new HashSet<>(answer);
        assertThat(answer.size()).isEqualTo(numberSet.size());
    }
}
