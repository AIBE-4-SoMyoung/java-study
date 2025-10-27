package day251027;

// 03_super (생성자)
public class _03_Super {
    public static void main(String[] args) {
        Student s = new Student("김자바", 20);
        s.introduce();
        CodingStudent cs = new CodingStudent("박자바", 50);
    }
}

class Student {
    // 생성자를 통해서 넣어줘야함
    public final String name;
    public final int age;

    Student(String name, int age) {
        // this <- 클래스를 통해서 생성될 객체 자체
        this.name = name;
        this.age = age; // 입력할 변수명과 입력당할(저장될) 변수명을 통일하는 건 일종의 의미론적 코딩.
    }

    void introduce() {
        System.out.println("안녕하세요 저는 " + name + "이고 " + age + "살 입니다.");
    }
}

class CodingStudent extends Student {
    String name;
    double age;
    CodingStudent(String name, int age) {
        // 상위클래스 <- 멤버변수한테 전달할 방법이 없음
        super(name, age); // super(...) <- 생성자
        this.name = name + " 학생";
        this.age = age;
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(age);
        super.introduce(); // <- super로 해서 참조하게 되면 this name을 가져오는게 아니라
        // super name을 가져옴.
        introduce();
    }

    @Override
    void introduce() {
        System.out.println("코딩 학생 소개");
        System.out.println("안녕하세요 저는 " + name + "이고 " + age + "살 입니다.");
    }

    // 1. super <- 상위 클래스 <= 생성자
    // 2. 상위(부모) 클래스 메서드 super <= overriding과는 상관없이 super -> 상위클래스의 메모리 영역
}