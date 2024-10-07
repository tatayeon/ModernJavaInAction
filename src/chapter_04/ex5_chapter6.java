package chapter_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex5_chapter6 {

    public static void main(String[] args){

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

//        long howManyDishes = specialMenu.stream().(Collectors.counting());

        //위에서 처럼의 불필요한 것들을 생략이 기능하다
        long howManyDishes2 = specialMenu.stream().count();
        System.out.println(howManyDishes2);



    }
}
