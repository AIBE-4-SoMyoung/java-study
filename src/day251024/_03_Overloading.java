package day251024;

// 메서드 오버로딩 (패러미터 갯수와 타입을 통해 동일한 메서드 이름을 재사용) <-> 오버라이딩 (상속, 구현 -> 이미 존재하던 메서드를 재정의)
public class _03_Overloading {
    public static void main(String[] args) {
        // integer, double, string...
        System.out.println(1); // 커서를 올려보면 각각 다른 메서드임을 확인 -> 집어넣는 패러미터의 갯수와 타입
        System.out.println(1.0);
        System.out.println("1");
        Util u = new Util();
        int num = u.add(1, 2);
        System.out.println(num);
        double num2 = u.add(1.0, 2.0);
        System.out.println(num2);
    }
}

class Util {
    int add (int a, int b) {
        return a + b;
    } // 한 메서드는 하나의 데이터타입 return.
    double addDouble(double a, double b) {
        return a + b;
    }
    // overload - 과적 -> method 이름은 하나인데 패러미터 구성에 따라서 여러 메서드들을 같은 이름으로 '과적' 해버림.
    double add (double a, double b) {
        return a + b; // 같은 이름인데 다른 메서드 패러미터 타입을 조합을 가지고 있기에
        // 동일한 이름의 메서드를 허용.
    }
    double add (double a, int b) {
        return a + b;
    }
    double add (double a, double b, double c) {
        return a + b + c; // 갯수와 구조가 다르면 된다
    }
    // 타입이 달라야함. (이름이 달라도 타입이 같으면 같은 구조 인식)
//    double add (double x, double y) {
//        return x + y; // 같은 이름인데 다른 메서드 패러미터 타입을 조합을 가지고 있기에
//        // 동일한 이름의 메서드를 허용.
//    }
}