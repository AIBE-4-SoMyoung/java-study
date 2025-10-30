package day251030;

// Lambda 표현식
// JS : arrow function (화살표 함수)
// -> 함수 표현식과 유사
// Java는 모든 함수가 '메서드'다 (class 포함...)
public class _01_Lambda {
    public static void main(String[] args) {
        Calculator c = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        // 람다 표현식
        // (매개변수) -> {구문}
        // (매개변수) -> {return 값} => (매개변수) -> 값
        // 익명함수 => 이름 없는 함수. add -> 연결.
        Calculator2 c2 = (a, b) -> {return a + b;};
        Calculator2 c3 = (a, b) -> a + b;
        // 1. java : 람다 표현식 -> 익명함수
        // 2. js '=>', java '->'
        System.out.println(c.add(100, 200));
        System.out.println(c2.add(105, 205));
        System.out.println(c3.add(110, 210));
    }
}

interface Calculator {
    int add(int a, int b);
}

@FunctionalInterface
interface Calculator2 {
    int add(int a, int b);
}
