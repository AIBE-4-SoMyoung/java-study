package day251024;

// static
public class _07_Static {
    // Java 메모리 구조
    // Method Area (MetaSpace) <- 최상위. 계속 유지 (코드가 끝날때까지...) <= 클래스, 메서드 코드 자체
    // Heap <- 객체. (new) - 인스턴스 변수 <= 메모리에 넣나뺐다가 GC(Garbage Collection)
    // Stack <- 메서드 {} => 지역변수, 매개변수

    // static은 heap을 거치지 않고도 클래스 자체가 변수와 메서드를 가질 수 있게 하는 기능 (블록, 클래스...) => Method Area.
    public static void main(String[] args) {
        // 접근제어자 public : 외부에서도 호출할 수 있게
        // static -> 객체를 생성하지 않고도 호출할 수 있게
        // void -> Return이 없다
        // ...
        Config config1 = new Config();
        Config config2 = new Config();
        System.out.println(config1.VERSION);
        System.out.println(config2.VERSION);
        config1.VERSION = "1.1.0"; // config1 변화 -> config2 영향 X. (격리)
        System.out.println(config1.VERSION);
        System.out.println(config2.VERSION);
        System.out.println(config1.VALUE);
        System.out.println(config2.VALUE);
        config1.VALUE = "BYE";
        System.out.println(config1.VALUE);
        System.out.println(config2.VALUE);
        System.out.println(Config.VALUE); // 클래스명.변수명.
        // static -> 1. 객체를 생성할 필요가 없다 2. 해당 클래스로 생성된 인스턴스가 서로 모두 공유한다
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increase();
        c2.increase();
        System.out.println(c1.count);
        System.out.println(c2.count);

    }
}

class Counter {
    static int count;
    void increase() {
        count++;
    }
}

class Config { // Configuration <- 설정
    String VERSION = "1.0.0"; // 멤버변수는 초기화도 가능
    static String VALUE = "hello";
    static void checkConfig() {
        // static -> '객체' X -> 객체 인스턴스 변수를 쓸 수 X
        // this <- static을 쓰는 순간 없음.
//        Config. -> class static 변수, static 메서드 호출할 수 있으나 static 안붙은 '객체'
        System.out.println(VALUE);
    }
    void checkConfig2() {
        Config.checkConfig(); // 객체에 소속된 메서드는 static 호출할 수 있지만, static 객체 소속된 X.
    }

    // 클래스 내부에 클래스를 정의 <- 상위 클래스 내부에서도 쓸 수 있게... static.
    static class Nested {
        // 중첩으로 외부 클래스를 만들지 않아도 된다 (모듈화 -> 한 java 파일에 public class는 1개 밖에 못둠)
        // 파일 하나로 하고 싶다 -> 전체 포괄하는 모듈(묶음) 단위 클래스를 두고 내부에 Nested (static class)...
    }

    static {
        // 메모리에서 호출될 때 별도의 생성자나 필요없이 실행하게 만드는 블록 (클래스 로드 시 1회 실행)
    }
}