package day251022;

// 반복문 (for)
public class _09_ForLoop {
    public static void main(String[] args) {
        // 일반적 for. -> 변수를 선언하는 방법 외엔 일치
        // js -> for in. for of
        // for in => Object - keys.
        // for of => 순서가 존재하는 반복가능한 객체(array) -> 모두 탐색하면서...
        // 반복가능한 객체 -> 내부 값들을 조회
        // java -> 향상된 for문. -> 배열, 리스트 => for of => 순서대로 원소를 조회

        // 기본 for문 for (초기식;종료식;증감식)
//        for (;;) {} // 무한반복
        // 배열이나 리스트처럼 0으로 순번이 시작하는 객체들과 많이 사용.
        for (int i = 0; i < 10; i++) { // 나머지는 다 같음.
            // let i = 0; i < 10; i++
            // 변수를 선언할 때 'type'. -> let 대신에 타입을 입력해서...
            System.out.println(i); // 0부터 9까지 계속 표현
            // break, continue 용법 다 유사.
            int j = 0; // scope가 더 깊은 수준이라서 외부에 영향 안줌.
        }
        int j = 0; // scope가 밖에 있어서 새로 선언 가능함
        // 이 이후에는 이미 j가 선언되었다고 판정되서 j는 새롭게 만들 수 X.

        // 향상된 for문.
        int[] arr = {1, 2, 3, 4, 5}; // {..., ..., ...}
        // java 대괄호 -> 배열 타입을 나타낼 때와 배열의 인덱스 조회할 때.
        // 배열을 직접 초기화해서 값을 입력해서 작성할 때... {}로 표시. js, python => []
        // 나열된 데이터
        for (int v : arr) { // for (const v of arr) {}
            System.out.println(v); // 따로 인덱스를 쓰지 않고
            // 내부에 있는 모든 값들을 확인 혹은 연산할 때...
            // for i -> index로 무언가를 해줄 때... 그 자체가 계산일 때
            // for of -> 내부 요소만 중요할 때
        }
    }
}