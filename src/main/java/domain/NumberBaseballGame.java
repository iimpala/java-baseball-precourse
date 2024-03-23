package domain;

import java.util.*;

public class NumberBaseballGame {
    private final NumberGenerator numberGenerator;
    private final List<Integer> answer = new ArrayList<>();

    public NumberBaseballGame(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void init() {
        answer.clear();
        answer.addAll(numberGenerator.generateNumbersBetween(1, 9, 3));
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
