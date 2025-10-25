package day251024;

// 상속 (Inheritance)
public class _10_Inheritance {
    public static void main(String[] args) {
        // CSS. 상속 -> 상위 개념/범위에서 무언가를 물려받는 걸 (값, 옵션) -> 상속
        MyDog dog = new MyDog("누렁이");
        dog.bark(); // 직접 구현한 것도
        dog.eat(); // 상속받아서
        System.out.println(dog.name);
        MyAnimal myAnimal = new MyDog("백구");
        System.out.println(myAnimal.name);
        myAnimal.eat();
//        myAnimal.bark() // MyDog.
        System.out.println(myAnimal instanceof MyAnimal);
        System.out.println(myAnimal instanceof MyDog);
        // '객체' -> 타입 => 메모리 그릇(변수) 따라서 가변적.
    }
}

class MyAnimal {
    void eat() {
        System.out.println("먹는다!!!");
    }
    final String name;
    MyAnimal(String name) {
        this.name = name;
    }
} // Animal의 범위 내에
class MyDog extends MyAnimal { // MyDog
    void bark() {
        System.out.println("멍멍!");
    }
    MyDog(String name) {
        // super 키워드 -> 상위(부모) 클래스
        super(name); // this처럼.
        System.out.println(super.name);
        System.out.println(this.name);
//        this.name = name; // <- this를 통해서 상위의 요소도 지정
    }
//    void eat() {
//        System.out.println("먹는다!!!");
//    }
//    final String name;
//    MyDog(String name) {
//        this.name = name;
//    }
}