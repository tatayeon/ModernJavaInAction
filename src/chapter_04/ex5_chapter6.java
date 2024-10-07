package chapter_04;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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

        Comparator<Dish> dishCaloriesCompartor = Comparator.comparingInt(Dish::getCalories);

        //maxBy로 최댓값 찾기
        Optional<Dish> mostCalorieDish = specialMenu.stream().collect(maxBy(dishCaloriesCompartor));
        System.out.println(mostCalorieDish);


        //위에는 메뉴 리스트의 총 칼로리를 계산하는 코드이다. (요약 연산 예제)
        //모든 트랜잭션을 돌리고 getCalories를 구한 다음에 이제 그 값을 하나씩 더하는 형태이다.
        int totalCalories = specialMenu.stream().collect(summingInt(Dish::getCalories));
        System.out.println(totalCalories);

        //같은 형식으로 여러가지 메서드들을 사용이 가능하다.
        Double totalCalories_averag = specialMenu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println(totalCalories_averag);

        //이 함수는 종합적으로 요소수 요리의 칼로리 합계 평균 최대 최소 등등을 계산하는 값이다.
        IntSummaryStatistics menuStatiestics = specialMenu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println("menuStatiestics:" + menuStatiestics);



    }
}
