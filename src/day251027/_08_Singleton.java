package day251027;

import java.util.Scanner;

// 08_싱글턴
public class _08_Singleton {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
//        Singleton s2 = new Singleton(); // 각각의 인스턴스
        // => 공유 'static' => 효율적이진 않음.
        // static <- 신체에 새겨넣는(??????)
//        System.out.println(s1.s.name);
//        System.out.println(s2.s.name);
//        s1.s.name = "변동사항~";
//        System.out.println(s1.s.name);
//        System.out.println(s2.s.name);
//        Singleton s1 = new Singleton(); // 이건 불가능하고...
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.increase();
        s2.increase();
        System.out.println(s1.counter);
        System.out.println(s2.counter);

    }
}

// 이게 뭐냐? static?
class Singleton {
    // 객체를 하나만 생성
    // -> 생성될 때 static 하게 관리되는게 아니라, 생애주기를 가지는 객체로서 만드는게 유리
    // => 객체로 생성(heap 메모리) <- 변동가능성이 코드 레벨이 아니라 외부에서 무언가를 실행중에 불러와야하는 경우
//    private static Singleton instance = new Singleton(); // static한 멤버변수를 만들어서...
    private static Singleton instance; // static한 멤버변수를 만들어서...
    String name = "싱글턴";

    private Singleton() {}; // 외부에서 new 만들 수 없음

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // 새롭게 객체를 만들어준다 (사용하는 시점부터만 객체가 존재)
        }
        return instance;
    }

    public int counter = 0;

    public void increase() {
        counter++;
    }
}

// 싱글톤으로 만든다? -> JDBC. WebClient. Fetch. -> Gemini/Groq, Supabase.
class MyScanner {
    private MyScanner() {};
    private static MyScanner instance; // 1개만 사용하게 된다

    final private Scanner sc = new Scanner(System.in);

    public static MyScanner getInstance() {
        if (instance == null) {
            instance = new MyScanner();
        }
        return instance;
    }

    public int nextInt() {
        return sc.nextInt();
    }
}