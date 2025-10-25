package day251023;

import java.util.ArrayList;
import java.util.List;

public class _05_ArrayListSubList {
    public static void main(String[] args) {
        // sublist
        // view 객체 <- 일부만 추출해서 해당 범위를 보도록 한 것
        List<String> l1 = new ArrayList<>(List.of("사과", "바나나", "체리", "수박"));
        System.out.println(l1);
        System.out.println(System.identityHashCode(l1));
        List<String> l2 = l1.subList(1,3); // 1,2
        // subList -> 별도의 객체를 만들긴 하는데 연결관계가 있는 상태에서
        // 1, 2까지의 범위에 대한 view를 생성한다.
        System.out.println(l2);
        System.out.println(System.identityHashCode(l2));
        l2.set(0, "고구마");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(System.identityHashCode(l1.get(1)));
        System.out.println(System.identityHashCode(l2.get(0)));
        // 1. 주소값이 다른데 같은 참조인 이유
        // - subList -> 원본 원소들을 복사해서 만든게 아니라, 그중에서 지정한 원소들의 주소값을 불러오는 '뷰(view) 객체'. 원소들의 레퍼런스(주소)들을 묶은 객체 -> 새로운 객체는 만들어졌으나... 해당 원소들은 다 객체. -> 해당 객체 연결을 수정하면 딸려서 다 수정
        // 2. 뷰 객체 - 연결관계가 유지된 상태에서 만들어진 사본.
        // addAll. new 키워드.
    }
}
