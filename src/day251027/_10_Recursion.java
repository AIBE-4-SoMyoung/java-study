package day251027;

// 10_재귀
public class _10_Recursion {
    // 재귀 - 메서드(함수) 내부에 스스로를 다시 호출
    public static void main(String[] args) {
        // 팩토리얼 (factorial)
        // n! -> n ~ 1까지 곱한 결과
        // 5! -> 5 * 4 * 3 * 2 * 1
        System.out.println(f1(5)); // 120.
        System.out.println(f2(5)); // 120.
        System.out.println(reverse("hello"));
    }

    public static int f1(int num) {
        int answer = 1; // 0 <- 곱셈이니까 불가
        for (int i = num; i >= 1; i--) {
            answer *= i;
        }
        return answer;
    }

    // 자바에서의 재귀 문제.
    public static int f2(int num) {
        // 1씩 줄어들고 있다
        // n! = n * (n-1)!
        //    = n * (n-1) * (n-2)!
        //    = n * ... * 1!
        //    = n * ... * 1 * 0!
        // 0! = 1
        // 문제가 무엇일까? -> 김자바 -> 김자바. => 무한루프
        // 재귀는 일종의 반복과 유사. -> 반복문. => '종료조건'
        if (num == 0) {
            // 0! = 1
            return 1; // 다시 호출하는 건 그만두고 1이라는 고정적 종료시점
        }
        return num * f2(num - 1);
    }

    // 문자열 뒤집기
    public static String reverse(String str) {
        // 인덱스가 1 이하일 때
        if (str.length() <= 1) {
            return str; // 전달받은 문자열 자체
        }

        // 무한반복 or 오류가 생길 때
        // 맨 앞글자를 빼고 substring + 맨뒷글자를 다음에 붙여준다
        return reverse(str.substring(1)) + str.charAt(0);
        // hello
        // ello + h
        // llo + e + h
        // lo + l + e + h
        // ...
        // [o] + l + l + e + h
    }

    // 1. 재귀의 경우엔 -> 다음 재귀로 전달할 수 있는 방법
    // (1) 매개변수
    // (2) static 변수, 인스턴스 변수 <- 사용할 수 있음. 유사 전역 처리.
    // -> 매개변수 => 계속 local로 만든다
    // <= 처리가 되서 상위로 던질 때는 return.
    // {} 지역적으로 처리해서 상위, 하위로 보내는 건데...
    // 패러미터로 넘기는 것 자체가 메모리가 이슈.
    // => 문제를 풀어보면서 여러가지 제약 (속도, 메모리...)
    // 2. 반복문으로는 해결할 수 없는 -> 재귀방식 => stack과 상당히 비슷.
    // f2(1) -> f2(2) -> f2(3) -> ... -> f2(x) (<=)
    // 실제 처리 순서가 f2(x-종료조건) -> ... f2(첫호출) // 코드가 생각보다 간결 (대신에 처리 과정에 대한 분석이나 과정...)
    // 3. 몇몇 경우는 재귀적처리가 시간적 효율성을 높여주는 경우.
}