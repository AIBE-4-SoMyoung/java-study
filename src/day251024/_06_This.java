package day251024;

import java.util.List;

// this
public class _06_This {
    // this -> 현재 생성자로 만들어지는 인스턴스 자체를 지칭하는 키워드
    // 1. 생성자 사용시 패러미터 이름 중복 해결
    // 2. 생성자 -> 이미 존재하는 생성자 체이닝
    // 3. 메서드 인수로 자기 자신을 전달할 때
    public static void main(String[] args) {
        // 직접 생성자를 1개 이상 만들면
        // Student s =  new Student(); // default 생성자는 생성되지 않음
        Student s1 = new Student("김자바");
        Student s2 = new Student("박자바", 25);
    }
}

class Student {
    private String name;
    private int age;

    Student (String name) {
//        name = "김자바";
        this.name = name; // 1
    }

    Student (String name, int age) {
        this(name); // 2 <- 이미 존재하던 생성자를 사용해서...
        this.age = age;
        // 인스턴스 -> 메서드 -> 넣을 수 있음.
        this.sayHello(this); // 3
        // 자기 자신을 객체 취급해서 스스로 넣는 것도 가능
        List<Student> list = List.of(this, this, this, this, this);
        for (Student s : list) {
            System.out.println(System.identityHashCode(s));
        }
    }

    void sayHello(Student s) {
        System.out.println(s.name);
    }
}
