package day251027;

import model.Animal;

// 04_Protected (접근제어자)
public class _04_Protected {
    public static void main(String[] args) {
        // 객체 지향? -> SOLID
        // https://ko.wikipedia.org/wiki/SOLID_(%EA%B0%9D%EC%B2%B4_%EC%A7%80%ED%96%A5_%EC%84%A4%EA%B3%84)
        // 객체 지향 4가지 특징 : 추상화(인터페이스, 추상클래스/메서드), 상속(extends), 다형성(오버로딩, 오버라이딩, 인터페이스, 캐스팅...), 캡슐화 (접근제어자, 접근자)

        Animal a = new Animal();
//        System.out.println(a.v1); // private x
//        System.out.println(a.v2); // protected x
//        System.out.println(a.v3); // default x
        System.out.println(a.v4); // public
    }
}

// 상속을 받음
class Dog extends Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
//        System.out.println(d.v1); private
        System.out.println(d.v2); // protected
        // protected - 상속 받은 범위에서는 사용가능하게 하겠다
//        System.out.println(d.v3); default
        System.out.println(d.v4);
        // private - default - protected - public
        // private -> 이 클래스 외에는 쓰지 못하게 하겠다
        // -> 접근자 (getter, setter)
        // default -> 동일한 패키지 경로 외에는...
        // protected -> default + 상속을 받은 범위에선...
        // public -> 다 접근해라~
    }
}
