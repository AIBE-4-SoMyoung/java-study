package day251027;

// 01_상속
public class _01_Inheritance {
    // 1) 재사용 2) 다형성(타입) + 의존성 주입 + 인터페이스
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name); // 멤버변수, 인스턴스변수 -> 객체들끼리 공유하지 x. 구분된 영역.
        animal.eat();
        Animal animal2 = new Animal();
        animal2.name = "고양이";
        System.out.println(animal2.name); // 구분된 영역
        System.out.println(animal.name);
        animal2.eat();
        Cat cat = new Cat();
        System.out.println(cat.name);
        System.out.println(cat.category);
        cat.meow();
        Animal animal3 = new Cat(); // 오버라이딩과 함께...
        System.out.println(animal3.name);
        // 만약에 상위 타입으로 변환했을 때 인스턴스변수의 경우에는 중복되는 이름이 있다면 상위 타입의 것을 사용. (정적 캐스팅)
    }
}

class Animal {
    String name = "동물";
    void eat() {
        System.out.println("먹는다");
    }
}

class Cat extends Animal {
    String category = "코숏";
    String name = "야옹이";
    void meow() {
        System.out.println("야야야옹");
    }
}