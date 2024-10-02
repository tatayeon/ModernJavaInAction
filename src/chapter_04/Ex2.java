package chapter_04;

import java.util.Arrays;
import java.util.List;

import static chapter_04.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Ex2 {

    public static void main(String[] args) {


        //프레디케잉트로 스트림 필터링하기
        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .distinct() //해당 스트림의 중복된 요소를 제거하고 고유한 요소만을 포함하는 새 스트림을 반환한다.
                .forEach(System.out::println);


    }
}
