package domain;

import java.util.Random;

public class NumberBaseballGame {

    private final Random random = new Random();
    private int[] answer = new int[3];

    public void generateAnswer() {
        for (int i = 0; i < 3; i++) {
            answer[i] =  random.nextInt(9) + 1;
        }
    }

    public int[] getAnswer() {
        return answer;
    }
}
