package day251022;

import java.util.Scanner;

public class _07_Conditional {
    // 흐름제어 -> 조건문, 반복문 + 예외처리
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // if문
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        if (age <= 20) { // if?
            System.out.println("알파 세대시군요!");
            if (age <= 7) { // if문 중첩도 가능.
                System.out.println("미취학 아동이십니다!");
            }
        } else if (age <= 30) {
            System.out.println("젠지 세대시군요!");
        } else if (age <= 40) {
            System.out.println("밀레니엄 세대시군요!");
        } else { // if 구문이 포괄하지 못하는 나머지 부분에 대한 응답, 처리.
            System.out.println("해당 되는 세대 구분이 없네요");
        }
        sc.nextLine();
        // switch
        System.out.print("등급을 입력해주세요! : ");
        String grade = sc.nextLine(); // 'A', 'B', 'C', ...
        switch (grade) {
            case "A":
                System.out.println("최고점 입니다");
                // fall-through
                break;
            case "B":
                System.out.println("중간점수 입니다");
                break;
            case "C":
                System.out.println("최하점 입니다");
                break;
            default:
                System.out.println("제대로 된 점수를 입력해주세요");
        }
        // switch 표현식 (jdk 14) - break를 생략해도 된다
        String message = switch (grade) {
            // switch -> 숫자, 문자열, enum. 사용할 수 있음.
            case "A" -> "최고점";
            case "B" -> "중간점";
            case "C" -> "최하점";
            default -> "잘못된 입력";
        };
        System.out.println(message);

        // if는 거의 동일하나, boolean으로 최종적으로 작동된 것만 조건식.
        // switch -> 거의 동일. (break이 없을 시 fall-through)
        // jdk14 -> switch 표현식.

        // 반환
        sc.close();
    }
}