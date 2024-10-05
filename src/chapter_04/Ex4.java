package chapter_04;

import java.util.Arrays;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        // 리스트에 숫자들 정의
        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        //처음 단계
        int sum1 =0;
        for (int x: numbers){
            sum1 += x;
        }

        // 2단계 reduce를 이용하면 애플리케이션의 반복된 패턴을 추상화 할 수 있다.
        int sum2 = numbers.stream().reduce(0, (a, b) -> a + b);

        // 결과 출력
        System.out.println("합계: " + sum2);

        int pridect = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("pridect:" + pridect);

        // 3단계: 여기에서는 기본 자바8에 들어가 있는 Integer클래스에 두 숫자를 더하는 정적 sum메서드를 제공한다 따라서 Integer::sum 이런식으로 사용도 가능하다.
        int sum3 = numbers.stream().reduce(0, Integer::sum);
        System.out.println("sum3: " + sum3);
    }


}
