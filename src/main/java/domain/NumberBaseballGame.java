package domain;

import domain.dto.GameResult;

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

    public GameResult judge(List<Integer> input) {
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < input.size(); i++) {
            if (!isStrike(input, i)) {
                ballCount += isBall(input.get(i));
                continue;
            }
            strikeCount += 1;
        }

        return new GameResult(strikeCount, ballCount);
    }

    // getter
    public List<Integer> getAnswer() {
        return answer;
    }


    // private methods
    private boolean isStrike(List<Integer> input, int i) {
        return answer.get(i).equals(input.get(i));
    }

    private int isBall(int num) {
        if (answer.contains(num)) {
            return 1;
        }

        return 0;
    }
}
