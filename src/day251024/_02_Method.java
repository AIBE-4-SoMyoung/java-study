package day251024;

// 메서드 (함수)
public class _02_Method {
    public static void main(String[] args) {
        // Java는 함수가 없다 (지금은 해당 안함)
        // Java는 원칙적으로 모든 함수가 클래스에 소속되는 걸 권장.
        // 클래스 내부에 있는 인스턴스 혹은 static을 통해서 호출되는 함수 -> 메서드
        Animal animal = new Animal();
        animal.hello(); // 인스턴스.메서드()
        // 인스턴스.메서드 <- JS => 함수 => 일급객체 <-> 자바에서는 메서드는 객체 x.
        // 함수 객체가 없는 건 아닌데 JS처럼 바로바로 할 수 X.
        animal.add(1, 10); // return값이 있다고 해서 변수 X.
        System.out.println(animal.add(1, 10)); // 다른 메서드들의 패러미터로 재전달
        int result = animal.add(10, 10);
        System.out.println(result);
        // 구조분해할당은 없나요? -> 없다 (객체구조분해할당, 배열구조분해할당 X)
        // POJO. VO. DTO. -> 매개변수를 '객체'로 받는 패턴. -> 속성(필드, 인스턴스변수, 멤버변수)
        // Props (typescript)
        int sum = animal.addAll(1, 2, 3, 4, 5);
    }
}

// ?
class Animal {
    // returnType name(param) {...}
    void hello() {
        System.out.println("Hello!");
    }
    // [접근제어자] [static] 반환타입 이름(매개변수) [throws 에러타입] {
    // 로직
    // }
    // 리턴타입이 변수 타입과 일치. void가 아니라 지정되어 있다면 return 필수.
    int add(int a, int b) { // 매개변수 -> 타입.
        return a + b; // 인스턴스 변수(클래스 변수, 생성자...)를 제외하고 외부에서 값을 받아오기 위해서는 일반적으로는 '매개변수'를 사용해야함.
    }
    int addAll(int... nums) { // java1.5 -> varargs -> 가변인자 <-> js에서의 '나머지 연산자'
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
