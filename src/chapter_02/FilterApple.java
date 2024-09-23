package chapter_02;

import java.util.ArrayList;
import java.util.List;

import static chapter_02.FilterApple.Color.GREEN;

public class FilterApple {

    enum Color {RED, GREEN}

    public static List<FilterApple> filterGreenApples(List<FilterApple> inventory, Color color) {
        List<FilterApple> result = new ArrayList<>();

        for (FilterApple apple : inventory) {
            if(apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        return result;
    }

}
