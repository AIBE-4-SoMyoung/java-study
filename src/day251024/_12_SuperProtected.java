package day251024;

import day251024.p2.ChildClass;

// super(this와의 차이점...), protected (접근제어자)
// 4개 public, protected(상속+같은패키지), default(패키지), private(같은 클래스 내) (점점 좁은 범위의 접근)
public class _12_SuperProtected {

    public static void main(String[] args) {
        MyJavaProgrammer programmer = new MyJavaProgrammer();
        System.out.println(programmer.name); // this.name
        programmer.work(); // this.work()
        MyKotlinProgrammer programmer2 = new MyKotlinProgrammer();
        programmer2.work(); // super 바로 상위에 있는 것을 지정.
        ChildClass child = new ChildClass();
//        child.pb - 이것만 호출 가능
    }
}

class MyProgrammer {
    String name = "김씨언어";

    MyProgrammer() {
        System.out.println("프로그래머 시작!");
    }

    void work() {
        System.out.println("열씨미 일하자!");
    }
}

class MyJavaProgrammer extends MyProgrammer {
    String name = "김자바";

    MyJavaProgrammer() {
        super(); // 상위 클래스의 생성자 사용가능.
    }

    @Override
    void work() {
//        this.work();
        System.out.println(super.name);
        super.work(); // 메모리 -> 객체를 넣으면 상속받은 상위클래스(부모클래스)의 설계로 만들어진 영역이 존재하는 개념.
        System.out.println("자바로 일하자!");
    }
}

// 상속에 상속에 상속에... extends를 사용할 경우엔 (Java에선) 다중상속 X.
class MyKotlinProgrammer extends MyJavaProgrammer {
    @Override
    void work() {
        super.work();
        System.out.println(super.name);
    }
}
