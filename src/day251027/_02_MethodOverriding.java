package day251027;

// 02_메서드 오버라이딩
public class _02_MethodOverriding {
    public static void main(String[] args) {
        // 클래스 내부에 들어간 변수
        // -> 멤버변수 (인스턴스변수, 필드, 속성) <= 객체가 소멸하기 전까지 계속 존재.
        // => class 바로 아래 (꼭 바로 class 키워드 아래일 필요는 없음). 접근제어자가 붙을 수 있고, 인스턴스마다 격리 범위를 가지는 변수.
        // => class로 생성된 instance 범위 내에서 공통적인 접근이 가능하고, 다른 메서드에서 외부 참조가 가능
        // -> 지역변수
        // 메서드 {} 안에서 생성된 변수 -> 메서드가 종료되면 소멸. <-> 멤버변수 => 유지 기간.
        // -> 매개변수 <= 메서드시그니쳐 (이름과 매개변수를 정의하는 파트를 통해 외부에서 전달받은 지역변수)

        // 상속
        // 물려받은 파트
        // 재정의한 파트 / 다형성.
        Vehicle v = new Vehicle();
        // ...
        Car c = new Car();
//        Car ...  static
        c.run();
        // c -> 인스턴스
        System.out.println(c.name);
        Vehicle v2 = new Car();
        System.out.println(v2.name); // 이전에 상위 클래스의 데이터 => 정적 바인딩
        // 예전 버전이 나온다...
        v2.run(); // 타입을 상위 타입에다 넣어도 '메서드'는 덮어씌워진 채로 간다...
        // 상위 타입으로 변경(캐스팅)되어도 덮어씌워진 메서드는 그대로 가는 걸 -> 동적 바인딩.
    }
}

//final class Vehicle { // 상속할 수 없음
class Vehicle { // 탈것
    // 인스턴스들이 따로 가져감 (생성자나 대입을 해서, setter를 사용해서 변경하고 호출...)
    String name = "따릉이";
    // 같은 클래스로 만들어진 인스턴스들이 공유하며, 인스턴스를 만들지 않아도 호출이 가능한 변수.
    static String description = "이것은 탈것입니다";

    void run() {
        System.out.println(name + "달려달려");
        System.out.println(description);
    }

    final void run2() {

    }

    static void describe() {
        // System.out.println(name);
        // static은 멤버변수를 쓸 수 없다 -> 인스턴스가 안만들어졌으니까
        System.out.println(description);
    }
}

class Car extends Vehicle {
    // 상속받았다고 해서 상속받은 걸 꼭 써줄 필요는 X
    // 재정의한다 <- 덮어씌워도 상관 X
    String name = "붕붕이"; // 어차피 'super' 키워드로 내부에서 호출가능하기 때문... -> 정의 안내려줬다 (겹치는게 없다면) => 자연스럽게  상위(부모) 클래스의 것을 사용 가능.
    static String description = "이것은 차입니다";

    @Override // 오버라이딩 여부를 체크하는 '어노테이션' / '애너테이션' <- 빌드/컴파일 => 프로그래밍 언어로  작성된 파일을 기계어/엔진이 해석할 수 있는 형태로 변경해주는 것 =>  IDE 에서의 개발이나 혹은 빌드 과정에서 추가적인 변형을 일으켜주는 옵션 전달
    void run() {
        System.out.println("부릉부릉");
    }

//    void run2() { // 상위 메서드에서 final 메서드의 경우 오버라이딩 불가
//
//    }

    //    @Override // 상속 받은 입장에서 새롭게 만들어진 경우에는 에러 처리
    void drive() {

    }

    // 오버로딩, 오버라이딩.
    // Over-loading - 동일한 이름의 메서드가 다른 패러미터 갯수, 타입 구조 (순서)를 가지고 있을 때 패러미터 입력에 따라 여러 메서드를 불러올 수 있는 것을 의미 (타입시스템)
    // Over-riding - 상속 받은 후에 같은 이름의 메서드를 새로 정의해서 '덮어씌움' => 동적 바인딩

    // 메서드 -> 추상화 => 구현을 안한 상태로 비워둘 수가 있음.
    // 멤버변수 -> final이 아니면 비워놓을 수가 있고.
    // 비워져있을 경우엔 => 아예 호출이 안되거나, 경우에 따라 null, 0, "" -> 기본값.
}