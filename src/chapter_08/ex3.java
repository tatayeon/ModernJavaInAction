package chapter_08;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class ex3 {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        // 친구의 이름과 나이를 저장한 맵 예제
        Map<String, Integer> ageOfFriends = new HashMap<>();
        ageOfFriends.put("Alice", 25);
        ageOfFriends.put("Bob", 30);
        ageOfFriends.put("Charlie", 28);

        // 맵 처리 예제들
        for (Map.Entry<String, Integer> entry : ageOfFriends.entrySet()) {
            String friend = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(friend + ": " + age);
        }

        // BiConsumer를 사용한 예제
        ageOfFriends.forEach((friend, age) -> System.out.println(friend + ": " + age));

        // favoriteMovies 예제
        Map<String, String> favoriteMovies = Map.ofEntries(
                entry("Raphael", "Star Wars"),
                entry("Olivia", "James Bond"),
                entry("Odsakjk", "asdas")
        );

        // 이름순으로 스트림 요소를 정렬
        favoriteMovies.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        // getOrDefault 예제
        System.out.println(favoriteMovies.getOrDefault("Odsakjk", "Matrix"));

        // 계산 패턴
        Map<String, byte[]> dataToHash = new HashMap<>();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

        // 샘플 데이터로 lines 리스트 생성
        List<String> lines = List.of("line1", "line2", "line3");

        // 해시 계산
        lines.forEach(line ->
                dataToHash.computeIfAbsent(line, ex3::calculateDigest)
        );

        //교체 패턴

        Map<String, String> favoriteMovies2 = new HashMap<>();
        favoriteMovies2.put("aaa", "sad1");
        favoriteMovies2.put("bbb", "sad2");
        favoriteMovies2.put("ccc", "asd3");
        favoriteMovies2.replaceAll((friend, movie) -> movie.toUpperCase()); //모두더 댜문자로 바꿔버린다.
        System.out.println(favoriteMovies2);
    }

    private static byte[] calculateDigest(String key) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            return messageDigest.digest(key.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }












}