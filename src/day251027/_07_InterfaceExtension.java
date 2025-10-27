package day251027;

// 07_interface 확장
public class _07_InterfaceExtension {
    public static void main(String[] args) {
        Kotlin k = new Kotlin() {
            @Override
            public void coding() {

            }
        };
        k.coding();
        Spring s = new Spring() {
            @Override
            public void coding() {

            }
        };
        Java.hello();
        s.coding();
    }
}

interface Java {
    void coding();

    // default
    default void test() {
        System.out.println("test"); // 인터페이스를 통해서 만들 클래스들이 공통으로 구현하는 내용이 있다면
        // default를 통해 만들 수 있음 (덜 수정/구현해도 된다)
        help2("hi");
    }

    static void hello() {
        help("hi");
        System.out.println("일반 클래스 스태틱");
    };

    // private <- helper, utility -> 외부에 노출될 일은 없는데 내부에 잘 쓸...
    private static String help(String msg) {
        return msg + "라는 메시지"; // static이나 default에서 사용할 수 있음
    }

    private String help2(String msg) {
        return msg + "라는 메시지"; // static이나 default에서 사용할 수 있음
    }

    // private은 상속 X.
}

interface Kotlin extends Java {

}

interface Spring extends Java {

}
