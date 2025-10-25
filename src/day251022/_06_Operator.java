package day251022;

import java.util.Scanner;

public class _06_Operator {
    // 연산자
    public static void main(String[] args) {
        // 산술 연산자
        // +, -, *, /, %
        System.out.println(1 + 1);
        System.out.println(2 - 1);
        System.out.println(3 * 2);
        // 나눗셈 같은 경우, 정수간의 나눗셈 결과물이 정수가 나온다
        System.out.println(10 / 4); // 10 / 4 -> 2.5 -> 2.
        // int (10) int (4) -> int (2.5) -> int (2)
        System.out.println(10.0 / 4); // 둘 중에 하나가 double 이어야 -> 나머지가 double로 타입 변환
        // -> 최종 결과의 타입이 소수점이 나온다
        System.out.println(2147483647 + 2147483647); // overflow -> 해당 범위를 넘기면 'overflow'
        // 할당해줄 때는 compile 검사를 해서 아예 원천으로 막아버리는데...
        System.out.println(2147483647 + 1); // + 맥시멈 값을 1 넘기면 가장 작은 값의 메모리부터라고 생각.
        long l = 2147483647L + 2147483647; // 한쪽이 Long이면 overflow 상관없음. (int)
        System.out.println(l);
        System.out.println(10 % 4);
//        System.out.println(10 ** 4); // 제곱 연산자는 없음. -> Math.pow
        System.out.println("안녕" + " " + "하세요"); // 문자열 -> concatenate. (연결)
        System.out.println("안녕" + 1 + "하세요"); // 문자열의 경우에는 문자열이 아닌 쪽을 문자열로 변환시켜줌

        // 대입연산자, 복합대입연산자 (=, +=, -= ...)
        // 변수나 상수 선언 후 해당 변수에 값을 할당/대입.
        // final이 안붙어있는 '변수'의 경우에는 피연산자 2 -> 연산 추가하는 쪽에 대입연산자를 붙여서 단축.
        int n1 = 10;
        n1 += 10; // 구문
        n1 *= 10; // 산술 연산자 -> 대입연산자 '복합 대입연산자'를 만들 수 있음.
        System.out.println(n1);
        // 단항연산자 -> 증감연산자.
        int n2 = 100;
        n2--; // 값.
        System.out.println(--n2); // ? -> 증감연산자 => 앞에 붙으면 '연산을 하고 난 값'을 표출 (전위)
        System.out.println(n2--); // 뒤에 붙으면 일단 값을 제공하고 그 다음에 연산. (후위)
        String v = "값";
        v += "값2";
        System.out.println(v);
        // 반복문에서 다시 좀...

        // 비교 & 논리
        // >, <, >=, <=
        // &&, ||, !
        // java 단축평가 -> 증감연산자
        int i1 = 100;
        // truthy, falsy가 없다 -> javascript마냥 편하게 쓰진 않음
        // || : 앞에가 true면 뒤에 연산 평가 안함
        System.out.println((i1 <= 100) || (i1++ >= 100)); // &&, ||.
        System.out.println(i1);
        // && : 앞에가 false면 뒤에 연산 평가 안함
        System.out.println((i1 > 100) && (i1++ >= 100)); // &&, ||.
        System.out.println(i1);
        // javascript은 해당 '값'을 결과값으로 준다면, java는 무조건 true/false로만 나타내고,
        // -> java에서는 일반적으로 boolean값을 리턴하는 메서드/함수들을 실행 여부를 판정.
        // login() && sendLoginMessage();
        // 로그인 성공 시 로그인 메시지를 보내는 방식
        // login() || loginBySocial(); // 종종 이런 코드가 보이기도 하는데...
        // 로그인 실패 시 소셜 로그인 작업까지 이어서 시도
        // 삼항연산자
//        int i2 = 50;
        Scanner sc = new Scanner(System.in);
//        int i2 = 50;
        System.out.print("숫자를 입력해보세요 : ");
        int i2 = sc.nextInt();
        String a = i2 > 50 ? "50보다 크다" : "50 이하다";
        System.out.println(a);
    }
}