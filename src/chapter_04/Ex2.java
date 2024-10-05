package chapter_04;

import java.util.Arrays;
import java.util.List;

import static chapter_04.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Ex2 {

    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 400, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );


        //프레디케잉트로 스트림 필터링하기
        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .distinct() //해당 스트림의 중복된 요소를 제거하고 고유한 요소만을 포함하는 새 스트림을 반환한다.
                .forEach(System.out::println);


        //이렇게 한다면 이 원래 정렬된 코드라고 해도 처음부터 끝까지 훓어 보는 작업이 들어갈 것이다.
        List<Dish> filteredMunu = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(toList());
        System.out.println(filteredMunu);

        List<Dish> filteredMunu1 = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(toList());
        System.out.println(filteredMunu1);

        List<Dish> filteredMunu2 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .collect(toList());
        System.out.println(filteredMunu2);

        //스트림의 각 요소에 함수 적용하기

        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(toList());

        List<String> words = Arrays.asList("modern", "Java", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());

        System.out.println(wordLengths);

        List<Integer> dishNameLengths = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList());
        System.out.println(dishNameLengths);

    }
}
