package day251024;

// final -> 상수.
// oop -> (접근제어자, static 메서드나 클래스. 멤버변수)
public class _08_Final {
    public static void main(String[] args) {

    }
}

// 상속 final class, final method -> 상속. => extends(확장). 오버라이딩(차단).
final class Calculator {
    final String name; // 멤버변수에 final을 붙여놓으면 '생성자'를 호출할 때 무조건 할당을 하겠다 // 객체 삭제시까지 운명 공동체. but 객체형의 자료를 넣으면 안에 있는 내용은 다를 수 있음. (List -> add. remove => 객체는 유지되는데 요소/원소/값 등은 바뀔 수 있음
    Calculator() {
        name = "?"; // 값을 무조건 넣어줘야한다 (생성자에만 바꿀 수 있게 됨)
        final String name2;
        name2 = "???"; // 블록 내부에서 선언된 '지역변수' <- 나중에 해도 상관없는데...
    }
    final void hello() {}
}
