package day251028;

// 타입 캐스팅
public class _01_TypeCasting {
    public static void main(String[] args) {
        // Type Casting : 한 데이터의 값을 다른 데이터 타입으로 변환하는 과정
        // 원시 타입들 간에는 어느정도의 변환
        // 참조 타입 -> 하위 타입을 상위 타입으로 변환/할당

        // 1.1 암묵적 형변환 -> 작은 크기의 데이터 타입 => 큰 크기의 데이터 타입으로 변환 (원시 타입)
        int value = 20;
        double result = value; // integer -> double
        System.out.println(result);
        // 1.2 명시적 형변환 -> 큰 크기의 데이터 타입을 작은 크기의 데이터 타입에 넣을 때 직접 '형변환 연산자' (변환할 타입)
        // => 데이터 손실의 가능성 (객체에서는 접근가능한 것이 달라지는 개념)
        double value2 = 3.1459;
//        int result2 = value2;
        int result2 = (int) value2;
        System.out.println(result2); // 소수점이 사라지게 된다
        // 1.3 기타 변환 - 메서드를 사용하는 경우
        double value3 = 1.414;
        // -> 문자열
//        String result3 = value3 + "";
        // 타입클래스.유틸리티메서드
        String result3 = String.valueOf(value3);
        System.out.println(result3);

        // 원시 타입, 일반적으로 쓰는 타입

        // 2. 클래스(참조타입)의 캐스팅
        // 1) 업캐스팅(Up-casting)
        // 하위(자식)클래스 -> 상위(부모)클래스
        // 구체적 클래스 -> 일반적 클래스(인터페이스)
        Cat cat = new Cat();
        Animal animal = cat; // 별도로 형변환 연산자를 쓰지 않아도 자동으로 변환 -> 별도로 데이터 손실 X.
        Animal[] arr = {new Cat(), new Dog(), new Cat(), new Dog()};
        for (Animal a : arr) {
            a.eat(); // 공통적인 메서드
            // 메서드가 존재하기해야하는데, 하위클래스마다 다르다
            // -> 오버라이딩 => 동적 바인딩
            if (a instanceof Cat) {
                ((Cat) a).meow();
            }
        }

        // 2) 다운캐스팅(Down-casting)
        // 다운캐스팅은 왜 존재하는 건가?
        Animal a = new Animal();
//        Cat c = a; // 상위 -> 하위
//        Cat c = (Cat) a; // 안전하지 않다
        if (animal instanceof Cat) { // 검사를 하고 나서...
            Cat cat2 = (Cat) animal; // 실제로는 Cat
            // 변수에 배정할 때는 상위타입으로 하였으나 실제 사용할 때 하위 타입으로 변환
            cat2.meow();
        }
    }

    //
}

class Animal {
    void eat() {};
}
class Cat extends Animal {
    void meow() {};
}
class Dog extends Animal {}
