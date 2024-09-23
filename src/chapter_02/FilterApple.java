package chapter_02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static chapter_02.FilterApple.Color.GREEN;
import static chapter_02.FilterApple.Color.RED;

public class FilterApple {

    public class AppleHeavyWeightPredicate implements ApplePredicate {
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }

    public class AppleGreenColorPredicate implements ApplePredicate {
        public boolean test(Apple apple) {
            return GREEN.equals(apple.getColor());
        }
    }

}
