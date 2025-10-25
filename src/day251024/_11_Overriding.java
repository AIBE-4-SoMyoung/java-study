package day251024;

// 메서드 오버라이딩
// 1. 오버로딩 vs 오버라이딩
// 2. @Override <- Superclass, 부모클래스 : 겹치는게 있는지 체크
// 3. 상위 타입으로 변환 시 -> 어떻게 각각 메서드, 멤버변수가 반응하는지.
public class _11_Overriding {
    public static void main(String[] args) {
        Car car = new Car();
        car.ride(); // Overriding - ride 올라타다 (덮어씌우기 오버라이드)
        car.ride(100); // Overloading
        Vehicle v = new Car();
        // ride?
        v.ride(); // Car의 ride. -> 동적 바인딩
        // 메서드 -> new로 생성된 걸 따라가고
        System.out.println(v.name); // 멤버변수는 -> 정적 바인딩
        // 멤버변수 -> 담긴 타입을 따라감.
    }
}

//final class Vehicle {
class Vehicle {
    String name = "부릉이";
    void ride() {
        System.out.println("부릉부릉");
    }
    final void run() {
        System.out.println("달려달려!");
    }
} // 확장이나 재정의를 막는 역할 (final)

class Car extends Vehicle {
    String name = "부릉삼";
    // Car -> ride
    @Override // @(어노테이션, 애너테이션)
    void ride() {
        // 새롭게 재정의
        System.out.println("차가 부릉부릉!");
    }
    //    @Override
    void ride(int speed) { // 오버라이딩이 아니라 오버로딩 (같은 이름의 메서드를 만든 것)
        System.out.println(speed + "km 속도로 부릉부릉");
    }
    // 상위 메서드에 final이 붙으면 재정의할 수 X.
//    void run() {
//
//    }
}