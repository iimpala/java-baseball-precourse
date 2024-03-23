package domain;

import java.util.Collection;

public interface NumberGenerator {
    Collection<Integer> generateNumbersBetween(int lowerBound, int upperBound, int n);
}
