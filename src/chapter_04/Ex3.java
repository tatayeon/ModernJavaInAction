package chapter_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
    }
}
