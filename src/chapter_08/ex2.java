package chapter_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex2 {

    public static void main(String[] args) {

        // 1. 숫자 리스트에서 짝수를 제거
        // removeIf 예제
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println(numbers); // [1, 3, 5, 7, 9]

        // 2. 문자열 리스트에서 숫자로 시작하는 문자열 제거
        ArrayList<String> transactions = new ArrayList<>(
                Arrays.asList("a12", "C14", "b13", "1ab", "2bc"));
        transactions.removeIf(transaction -> Character.isDigit(transaction.charAt(0)));
        System.out.println(transactions); // [a12, C14, b13]

        // 3. 각 문자열의 첫 글자를 대문자로 변환하여 출력
        // reolaceALL의 예제
        List<String> referenceCode = Arrays.asList("a12", "c14", "b13");
        referenceCode.stream()
                .map(code -> Character.toUpperCase(code.charAt(0)) + code.substring(1))
                .collect(Collectors.toList())
                .forEach(System.out::println); // A12, C14, B13

        // 4. 문자열 리스트에서 각 요소의 첫 글자를 대문자로 변환
        ArrayList<String> referenceCodes = new ArrayList<>(
                Arrays.asList("a12", "c14", "b13"));
        referenceCodes.replaceAll(code -> Character.toUpperCase(code.charAt(0)) + code.substring(1));
        System.out.println(referenceCodes); // [A12, C14, B13]
    }
}