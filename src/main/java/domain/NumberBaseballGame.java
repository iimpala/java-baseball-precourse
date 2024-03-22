package domain;

import java.util.*;

public class NumberBaseballGame {

    private static final int COUNT = 3;
    private final Random random = new Random();
    private final List<Integer> answer = new ArrayList<>();

    public void init() {
        answer.clear();
        generateAnswer();
    }

    public List<Integer> getAnswer() {
        return answer;
    }


    // private methods
    private void generateAnswer() {
        HashSet<Integer> randomNumbers = new HashSet<>();

        while (randomNumbers.size() < COUNT) {
            int number = random.nextInt(9) + 1;
            randomNumbers.add(number);
        }

        answer.addAll(randomNumbers);
    }
}
