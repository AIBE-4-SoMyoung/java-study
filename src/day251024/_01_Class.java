package day251024;

// class
public class _01_Class {
    // class -> JS. class? <- Object. <= 데이터묶음. dictionary, map. (key-value) + method.
    // React, Next. <= 함수형 컴포넌트. Provider...

    // Java -> 1.0 -> Class. => 참조 타입. => 의존성 주입 (Dependency Injection)
    // 중복, 자주 사용되는 객체 -> 싱글톤 패턴 / 팩토리 -> 효율적인 객체/메모리 관리... (Spring)

    public static void main(String[] args) {
        // 절차적 프로그래밍 (PP), 객체 지향 프로그래밍 (OOP), 함수형 프로그래밍 (FP)

        // 코드를 쭉 작성하는 형태
        // -> 절차적 프로그래밍 (PP) : 자주 쓰이는 구문 => 절차(procedure)라는 방식으로 묶어서 재사용 => 순차적으로 실행되는 것이 계속 중요
        // -> '데이터'를 기반으로 작업...
        // 속성 (변수...) <- 어느 데이터, 묶음? => 객체 (Object)
        // 사람. ... 사람_이름, 사람_나이, 사람_실력 .... => 관리가 어려움
        // 사람.이름, 사람.나이, 사람.실력 ... , 사람.함수, 사람.프로시저...
        // 필드(속성) & 함수(메서드) => 객체.
        // 객체 -> 그때 그때 만드는게 X. => 설계도로 반복적으로 만들어자. <- Class.
        // Class -> Object(객체) => Instance. (인스턴스)
        // C언어(절차적) -> C++.
        // Java, C#. <- 수학적, 논리적 지저분해 => 함수형 프로그래밍 (리스프, 하스켈)
        // 메이저한 언어들이 함수형 <- lambda 흡수해서 활용하고 있다...

        Person p = new Person(); // 붕어빵.
        // 붕어빵 틀 -> 클래스 -> 붕어빵 -> 객체.
        // 원시 타입 X. 참조/객체.
        System.out.println(System.identityHashCode(p)); // 메모리에 적재(적->실어놓는다)
        System.out.println(p); // 주소값
        // 메모리에 들어갔다
        Person p2 = new Person();
        p.name = "김자바"; // 할당
        System.out.println(p.name); // 간섭하지 않는다
        System.out.println(p2.name); // 참조타입 -> null.
        p2.name = "박JS"; // 할당
        System.out.println(p.name);
        System.out.println(p2.name); // 별도의 객체이기 때문에 영향 X.
        Person p3 = p; // 메모리주소가 전달
        p.name = "이자바";
        System.out.println(p.name);
        System.out.println(p2.name);
        System.out.println(p3.name); // 같은 객체 주소를 다른 변수에 넣음
        p.hello();
        p2.hello();
        p3.hello();
    }
}

class Person {
    String name; // 멤버변수, 속성, 필드, 인스턴스 변수
    // 클래스를 통해서 객체에 부여된 변수.
    // 클래스를 통해서 한 번 만들어진 다음에는 서로 별도의 scope(범위) -> 간섭하지 않는다
    void hello() {
        System.out.println("Hello I'm " + name);
        // 클래스로 생성된 객체 내부에서는 메서드와 인스턴스변수 간의 호출이 가능
    }
}
