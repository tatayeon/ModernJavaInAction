package chapter_04;

import javax.print.attribute.standard.MediaSize;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static chapter_04.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Ex3 {
    public static void main(String[] args) {

        String[] arrayOfWords = {"GoodBye", "World"};
        List<String> words = Arrays.asList("modern", "Java", "In", "Action");

        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
//
//        List<String> uniqueChars = words.stream()
//                .map(word -> wrod.split(""))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(toList());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(toList());
        System.out.println(squares);

        List<Integer> num1 = Arrays.asList(1, 2, 3);
        List<Integer> num2 = Arrays.asList(3, 4);
        List<int[]> pre = num1.stream()
                .flatMap(i -> num2.stream()
                .map(j-> new int[]{i,j}))
                .collect(toList());
        System.out.println(pre);

        //프레디케이트가 적어도 한 요소와 일치하는지 확인.
        //anyMatch()함수를 사용해서 적어도 한 요소와 일치하는지 확인할 때 anyMatch를 사용한다.
        if(menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("the menu is (somewhat) vegetarian");
        }

        //allMatch는 모든 요소가 주어진 프레디케이트와 일치하는지르 검사한다.
        boolean isHealthy = menu.stream()
                .allMatch(dish -> dish.getCalories() < 1000);

        //반대로 이거는 일치하는 요소가 없는지 확인한다.
        boolean isHealthy1 = menu.stream().noneMatch(d -> d.getCalories()>=1000);

        //findAny를 사용해서 현재 스트림에서 임의의 요소를 반환한다.
        //스트림 파이프라인은 내부적으로 단일 과정으로 실행할 수 있도록 최적화된다.
        //Optional은 null을 처리하기 위해서 예외처리를 위해 사용
        Optional<Dish> dish = menu.stream().filter(Dish::isVegetarian)
                .findAny();

        //이렇게 findFirst를 사용을하면 논리적인 아이템 순서가 정해저 있는 것중에 처음을 찾을 수 있다.
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                        .map(n -> n * n)
                        .filter(n -> n % 3 == 0)
                        .findFirst(); //9
        System.out.println(firstSquareDivisibleByThree);



    }
}
