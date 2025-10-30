package day251030;

import java.util.*;

// 스트림 (반복되는 객체(리스트, 배열) -> 일괄 처리
// 배열, 리스트 -> Stream -> ...
// JS -> 고차함수. -> Array 내장.
public class _03_ {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(100));
        }
        System.out.println(list);
//        list -> for문, while-> index...
//        list
//          .stream()
//          .(........)
//          .toList();
        // filter, map, reduce, forEach
        // filter
        System.out.println(
                // 홀수만 남기기
                list.stream()
//                .filter((o) -> o % 2 == 1)
                        .filter((o) -> o % 2 == 0)
                        // list의 원소들의 타입 -> 통일.
                        // o -> boolean
                        .toList()
        );
        List<Integer> filtered = list.stream()
                .filter((o) -> o % 2 == 0)
                .toList();
        System.out.println(System.identityHashCode(list));
        System.out.println(System.identityHashCode(filtered));
        // stream -> 원본에 직접적으로 영향 X.
        // map
        System.out.println(
                list.stream()
//                .map((o) -> o * 2) // 들어온 패러미터 타입 -> return 값.
                        .map((o) -> o * 0.1) // Double
                        .toList()
        );
        List<Double> mapped = list.stream()
                // 타입의 변환이 유동적
                .map((o) -> o * 0.1) // map을 하면 return에 따라서 Stream의 타입이 달라짐
                // 체이닝
                .map(Math::floor) // 소수점 아래 값을 삭제
                .toList();
        System.out.println(mapped);
        // reduce -> 요소들을 제거하면서 하나의 값으로 만드는 것
        System.out.println(
//                list.stream()
//                        // acc
//                        .reduce(0, (o1, o2) -> o1 + o2)
                list.stream()
                        // acc
                        .reduce(0, Integer::sum)
        );
        // stream 체이닝 <- for문 대체
        System.out.println(
                list.stream()
                        .filter((o) -> o >= 10)
                        .map((o) -> Math.pow(o, 2))
                        .map(Double::intValue)
                        .reduce(0, Integer::sum)
        );
        // forEach
//        list.stream()
//                .forEach((o) -> System.out.println(o));
//        list.stream()
//                .forEach(System.out::println);
        list.stream()
                .filter((o) -> o >= 50)
                .map((o) -> o * 2)
                .forEach(System.out::println);
        System.out.println(
                // Optional (빈 stream일 수도 있어서.. null)
                list.stream().max(Integer::compareTo) // Optional (검사)
                        .orElseThrow() // null이면 throw
        );
    }
}
