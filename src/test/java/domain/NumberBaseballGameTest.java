package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class NumberBaseballGameTest {
    @Test
    @DisplayName("1~9 사이의 랜덤한 정수 3개를 생성한다")
    void generateAnswer() {
        //given
        NumberBaseballGame game = new NumberBaseballGame();

        //when
        game.generateAnswer();

        //then
        int[] answer = game.getAnswer();

        assertThat(answer.length).isEqualTo(3);
        for (int number : answer) {
            assertThat(number).isBetween(1, 9);
        }
    }
}
