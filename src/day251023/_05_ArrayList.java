package day251023;

// List / ArrayList
import java.util.*;
// List <- '구현'. ArrayList, LinkedList...


public class _05_ArrayList {
    public static void main(String[] args) {
        // 배열 -> 속도. -> 길이가 가변적이지 않다
        // List (Collection)
        // 배열 타입[] 이름...
        // Wrapper 클래스
        // <> -> Generic -> 다양한 '클래스/참조' 타입을 대응할 수 있게 한 설계 -> 원시 타입을 못 넣음.
//        List<int>
        // Wrapper -> 기본(원시) 타입 대신에 사용해줄 수 있는 참조 타입
        // int - Integer, long -> Long, double -> Double,
        // boolean -> Boolean, char -> Character
        List<Integer> list = new ArrayList<>(); // 범용적이고 array와 유사한 내적 구조
        // 약속<타입> list = new 실제로구현된클래스<>();
        List<Integer> list2 = new LinkedList<>(); // Queue. 특정한 문제/구현 쓰이는 것.
        // 둘의 메서드나 호출할 수 있는 멤버변수(필드)는 실질적으로 동일

        // list.add(값) -> 추가할 수록 길이가 '늘어난다'
        // list.get(인덱스) -> 값 불러오기
        // list.set(인덱스, 값) -> 해당 값에 덮어 씌우기
        // list.clear() -> 전체 지우기
        // -> 한번에 다 지울 수 있다
        // list.remove() -> 값, 인덱스 찾아서 삭제
        // for, for-each(향상된 for문)
        // size(), contains, sort, clone...

        // 구현 -> List (편의성), 알고리즘 -> 배열, Stack, Queue. Deque
        List<Integer> numList = new ArrayList<>();
        numList.add(100); // push, append, add. -> 맨뒤에 새로운 인덱스(길이)를 증가시키면서 새롭게 추가
        numList.add(1000);
        System.out.println(numList);
        // 배열 -> 출력 '주소값'? / 리스트 : 값을 바로 문자열화
        numList.add(256);
        System.out.println(numList);

        // get - 인덱스 -> 값 호출
        // set -> 인덱스, 새로운 값 -> 덮어씌우기
        System.out.println(numList.get(0));
        numList.set(1, 2048);
        System.out.println(numList);

        // size -> length.
        System.out.println(numList.size());
        numList.clear(); // 수정 가능 -> mutable.
        System.out.println(numList);

        // List.of -> 나열된 원소로 리스트
        List<Integer> numList2 = new ArrayList<>( List.of(100, 200, 300, 400, 500));
        // new ArrayList<>(...)
        // List.of(100, 200, 300, 400, 500) -> 불변객체.
        System.out.println(numList2);
        // remove(인덱스). -> 지우고 나면 인덱스가 바뀜.
        // 속도도 상당히 느린 편
        numList2.remove(2);
        System.out.println(numList2);

        // contains
        System.out.println(numList2.contains(100));
        System.out.println(numList2.contains(600));

        // numlist -> 100, 2048, 256
        // 오름차순 (데이터의 등장 순서와 커지는 순서가 일치), 내림차순 (역순)
        // void -> 새로운 변화된 값을 x. 그 객체 자체를 순서를 수정.
        List<Integer> numList3 = new ArrayList<>(List.of(1, 2048, 20));
        numList3.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(numList3);
        numList3.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(numList3);
        // 나중에는 람다표현식 등을 활용한 Stream 정렬을 많이 씀.
        // 배열에도 정렬이 있긴하는데
        // Arrays.sort -> 무조건 '오름차순'

        // 반복
        for (int i = 0; i < numList3.size(); i++) {
            System.out.println(numList3.get(i));
        }
        for (int v : numList3) {
            System.out.println(v);
        }

        // 복사
        // 재할당/얕은복사, 깊은복사
        List<String> textList = new ArrayList<>(List.of("서울", "인천", "대전", "대구", "부산"));
        List<String> textList2 = textList;
        System.out.println(System.identityHashCode(textList));
        System.out.println(System.identityHashCode(textList2));
        textList.set(0,"울산");
        System.out.println(textList);
        System.out.println(textList2);
        List<String> textList3 = textList.subList(0, textList.size()); // sublist를 사용해서 (얕은 복사)
        System.out.println(System.identityHashCode(textList));
        System.out.println(System.identityHashCode(textList3));
        textList.set(0,"제주");
        System.out.println(textList);
        System.out.println(textList2);
        System.out.println(textList3);
        List<String> textList4 = new ArrayList<>(textList3); // 새로운 생성자를 사용해서 관계 X.
        List<String> textList5 = new ArrayList<>();
        textList5.addAll(textList); // 스프레드연산자 (...)
        textList.set(0,"울릉도");
        System.out.println(textList);
        System.out.println(textList2);
        System.out.println(textList3);
        System.out.println(textList4);
        System.out.println(textList5);
    }
}
