package day251027;

// 09_Enum
public class _09_Enum {
    public static void main(String[] args) {
        Size s = Size.S;
        System.out.println(s);
        switch (s) {
            case S:
                System.out.println("작은 사이즈");
//                System.out.println(s.desc);
                System.out.println(s.getDesc());
                break;
            case M:
                System.out.println("중간 사이즈");
                System.out.println(s.getDesc());
                break;
            case L:
                System.out.println("큰 사이즈");
                System.out.println(s.getDesc());
                break;
            case XL:
                System.out.println("하나 더 큰 사이즈");
                System.out.println(s.getDesc());
                break;
        }
    }
}

// Enum
enum Size {
    //    S,
//    M,
//    L,
//    XL;
    S("작다"),
    M("중간이다"),
    L("크다"),
    XL("진짜 크다");

    private final String desc;

    // 생성자
    Size(String desc) {
        this.desc = desc;
    };

    public String getDesc() {
        return desc;
    }
}