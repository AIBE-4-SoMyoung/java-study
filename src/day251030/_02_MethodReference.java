package day251030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 메서드 참조
public class _02_MethodReference {
    public static void main(String[] args) {
        // 몇몇 메서드들은 '함수'를 패러미터로 받는 경우
        // 1. 기존에 존재하던 메서드를 전달 -> 메서드 참조
        // 2. 람다 표현식으로 익명함수를 전달
        List<String> names = new ArrayList<>(List.of("이자바", "김자바", "박자바")); // Collection
        Collections.sort(names); // 오름차순
        System.out.println(names);
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
////                return o1.compareTo(o2); // 오름차순
//                return o2.compareTo(o1); // 내림차순
//            }
//        }); // 인터페이스 -> 함수를 직접 정의해서 집어넣는 걸 의미
        Collections.sort(names, (o1, o2) -> {
//            return o1.compareTo(o2);
            return o2.compareTo(o1);
        });
        SortUtil util = new SortUtil();
//        Collections.sort(names, SortUtil::reverseOrder); // 스태틱 메서드 참조
        Collections.sort(names, util::reverseOrder2); // 인스턴스 메서드를 참조
        System.out.println(names);
    }
}

class SortUtil {
    static int reverseOrder(String o1, String o2) { // 매개변수 이름은 상관 X.
        return o2.compareTo(o1);
    }
    int reverseOrder2(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
