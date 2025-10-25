package day251022;

// ctrl + /, cmd + / -> 주석 (//)
// JS -> window. -> 별도로 묶어서 시작할 필요는 없었음
// Java -> Class. (Java 8을 중심으로 설명)
// java -> class 파일로 컴파일을 한다... IntelliJ 환경에서 의식할 필요는 없음
// '컴파일'한다는 건 중요 -> 실행하기 앞서서 검증작업을 한다
public class _02_Output { // class -> object 객체.
    // -> public (접근제어자)
    // class -> 사용.
    // 변수와 함수. -> 변수 => class 내부에 들어가면 '멤버변수', '속성', '필드'
    // 함수 -> 메서드(method)

    // 주석 -> 한줄주석(//) -> ctrl + /, cmd + /
    // 여러줄주석(/* */) -> ctrl + shift + /, cmd + shift + /

    // 진입점
    // (public) static -> 객체로 만들지 않아도 클래스 자체로 실행 가능
    // void -> 반환할 타입 지정 -> void(진공, 공허, 없음) -> 이 함수는 return이 없거나 return을 통해 외부로 전달하지 않음
    // JS -> 함수를 function 키워드 외에 다른 형태의 추가적 정보들을 많이 제공해야 된다
    // main -> 메서드의 이름
    // 메서드 시그니쳐 -> parameter (매개변수)
    // String[] args <- 인자들을 받겠다
    // Main.java data1 data2 ... (굳이 해보지 않을 방식)
    public static void main(String[] args) {
        // 출력과 입력 (입출력)
        System.out.println("Example01.main"); // soutm
        System.out.println("안녕하세요!");
//        System.out // -> print, printf, println
        // ctrl + D / cmd + D : 현재 줄 복사
        System.out.print("안녕하세요"); // 둘이 붙어서 나옴
        System.out.print("반갑습니다"); // 줄바꿈이 내부에 없어
        // \n -> 개행문자 -> 줄바꿈을 '문자'로 나타냄
        System.out.print("안녕하세요\n"); // 둘이 붙어서 나옴
        System.out.print("반갑습니다"); // 줄바꿈이 내부에 없어서
        System.out.println("안녕하세요"); // 안녕하세요\n
        System.out.println("반갑습니다"); // 반갑습니다\n
        System.out.printf("%d\n", 10); // 특정한 값이나 변수에 대한 포맷 처리 - 숫자 10.
        System.out.printf("%s\n", "안녕"); // 특정한 값이나 변수에 대한 포맷 처리 - 문자열을 넣는 표기법
    }
}
