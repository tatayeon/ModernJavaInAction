package chapter_04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static chapter_04.Dish.menu;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Ex1_lowCaloriDisheName {

    public static void main(String[] args) {

        List<String> lowCaloriDisheNames =
                menu.stream()
                        .filter(d -> d.getCalories() < 400)
                        .sorted(comparing(Dish::getCalories))
                        .map(Dish::getName)
                        .collect(toList());
    }

}
