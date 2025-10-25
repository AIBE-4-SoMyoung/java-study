package day251024;

// 생성자
public class _05_Constructor {
    public static void main(String[] args) {
        // 생성자(constructor) : new 키워드를 앞에 붙여서 클래스를 통해서 인스턴스(객체)를 생성하는 역할을 하는 특수한 <메서드>.
        // JS - 생성자 : 1개만. <-> Java : 엄청 존재할 수. 메서드 오버로드(오버로딩)
        // 메서드 -> 접근제어자.
        Programmer p = new Programmer();
        // 1. 나는 생성자를 만든 기억이 없는데? (default?)
        // 2. 메서드라면 리턴?
        // 3. 메서드라면 패러미터가 있는 거 아냐? -> 오버로딩
        Programmer p2 = new Programmer(123);
//        p.name = "김자바";
//        p.language = "JAVA";
        Programmer p3 = new Programmer("김자바", "자바");
        p3.intro();
    }
}

class Programmer {
    // 필드(인스턴스 변수)
    private String name;
    private String language;

    // 클래스이름(패러미터) {}
    Programmer() {} // 디폴트 생성자
    // return? -> 자기 자신 타입.
    // Programmer 생성자() {return Programmer()}
    Programmer(int age) {
        System.out.println(age);
    }

    //    Programmer(String nameValue, String languageValue) {
    Programmer(String name, String language) {
//    Programmer(String name, String language) {
//        name = nameValue; // 매개변수 전달받은 name인지 인스턴스의 name
        // 우선권이 가장 가깝게 정의된 local 지역변수인 매개변수가 가져감
//        language = languageValue;
        // 인스턴스 변수로 확실히 찾을 수 있는 'this'
        // 이 클래스를 통해서 결과적으로 만들어질 인스턴스.
        this.name = name;
        this.language = language;
    }

    void intro() {
//        System.out.println("안녕하세요 " + language + " 개발자 " + name + "입니다.");
//        System.out.println("""
//                안녕하세요, %s 개발자 %s입니다.
//                """.formatted(language, name));
        System.out.println("""
                안녕하세요, %s 개발자 %s입니다.
                """.formatted(this.language, this.name));
    }
}