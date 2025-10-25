package day251023;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Set
public class _07_Set {
    public static void main(String[] args) {
        // 인터페이스<제너릭> 변수명 = new 구현체<>();
        Set<String> set = new HashSet<>();
        set.add("자바"); // List?
        System.out.println(set);
        set.add("자바"); // 중복을 무시. 이미 추가된 요소의 경우에는 중복해서 추가하지 않음.
        // Map <- 같은 키의 경우에는 '덮어씌운다'. 없으면 추가.
        // Set <- 모든게 키. <- 무시된다
        // 존재 여부를 체크. Set. <- Hash? <- HashSet.
//        set.size()
        set.add("자바스크립트");
        System.out.println(set);
        for (String v : set) { // 별도의 변환 없이 for-each문.
            System.out.println(v);
        }
        set.remove("자바스크립트");
        // 개별 조회가 필요 X.
        System.out.println(set.contains("CSS"));
        System.out.println(set.contains("자바"));
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set);
        // 중복이 없는 집합 연산
        Set<String> set1 = new HashSet<>(List.of(
                "자바", "자바스크립트", "파이썬", "파이썬"
        ));
        Set<String> set2 = new HashSet<>(List.of(
                "자바", "HTML", "CSS", "HTML"
        )); // 중복은 무시하고 구성
        System.out.println(set1);
        System.out.println(set2);
        // 합집합 -> 중복되는 것은 1개만 남기도 둘을 합치는 것.
//        set1.addAll(set2);
//        System.out.println(set1);
        // 교집합 -> 둘 다 존재하는 걸
//        set1.retainAll(set2);
//        System.out.println(set1);
        // 차집합 (A, B -> A - B => A와 B 사이의 공통 부분을 A 제거)
//        set1.removeAll(set2);
//        System.out.println(set1);
        // 부분집합
        set1.addAll(set2); // set1 > set2.
        System.out.println(set1.containsAll(set2));
    }
}
