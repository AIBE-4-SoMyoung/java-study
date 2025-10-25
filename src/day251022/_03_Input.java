package day251022;

import java.util.Scanner; // 다른 경로에서 이미 작성된 클래스 등을 불러오는 기능

public class _03_Input {
    public static void main(String[] args) {
        // 표준 입력
        // console, terminal -> 자바에서는 이걸 통해 입력
        // Scanner -> 객체. new.
        Scanner scanner = new Scanner(System.in); // System <- 문자열을 받아주겠다
        // scanner.nextLine()
        System.out.print("입력해주세요 : "); // (1) ln이 없기 때문에 뒤에 바로 nextLine -> scanner 연결
        // scanner.nextLine() // (2)
        // System.out.println // (3)
//        System.out.println(scanner.nextLine()); // 한 줄을 다 받겠다
        // intellij -> alt + shift 방향키 -> 이동.
        String input = scanner.nextLine(); // 변수 앞에 let, const 키워드 X. 타입명을 기술.
        // scanner. -> 여러가지 입력을 처리할 수 있는 메서드가 존재. 나중에...
        System.out.println(input);
        // 다 사용하고 나면 -> scanner 입력이 끝나면 그 다음에 println이 실행되면서 출력
        scanner.close(); // 닫아준다(반환)
    }
}