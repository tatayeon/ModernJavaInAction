package chapter_04;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Ex6 {

    // 분할 예제들
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

    //분할은 이런식으로 블린형이 사용이 된다.
    public void printPartitionedMenu() {
        Map<Boolean, List<Dish>> partitionMenu = specialMenu.stream()
                .collect(partitioningBy(Dish::isVegetarian));
        System.out.println(partitionMenu);
    }

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

        Ex6 example = new Ex6();
        example.printPartitionedMenu();

        //이렇게 분할의 장점은 참, 거짓 두가지 요소의 스트림 리스트를 모두 유지가 가능하다
        Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishByType = specialMenu.stream().collect(
                partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType))
        );

        System.out.println("vegetarianDishByType" +vegetarianDishByType);



    }
}