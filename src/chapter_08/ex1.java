package chapter_08;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class ex1 {

    public static void main(String[] args) {

        //리스트 팩토리
        //먼저 이렇게 간단하게 만들 수 있다. 하지만 요소를 변경하지 못한다.
        List<String> friends = List.of("aaa", "bbb", "ccc");
        System.out.println(friends);

//        friends.add("kkk");

        //집합 팩토리
        //단점으로는 중복된 요소를 제공해 집합을 만들려고 하면 오류발생한다.
        Set<String> friends2 = Set.of("aaa", "bbb", "ccc");
        System.out.println(friends2);

        //맵 팩토리
        Map<String, Integer> friends3 = Map.of("aaa", 1, "bbb", 2, "ccc", 3);
        System.out.println(friends3);

        Map<String, Integer> friends4 = Map.ofEntries(
                entry("aaa", 30),
                entry("bbb", 23),
                entry("ccc", 12)
        );
        System.out.println(friends4);



    }

}
