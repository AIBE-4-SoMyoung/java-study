package day251022;

import java.util.Random;

// 반복문
public class _08_WhileLoop {
    public static void main(String[] args) {
        // while, for
        Random rd = new Random(); // js -> Math.random...
        // while. 주사위 -> 주사위가 1~6. -> 6 나오면 반복종료한다
        // while (true) -> 반복 / false -> x
        // 0 ~ 5 -> 1을 더해줘서 -> 1, 6
//        while (rd.nextInt(6) + 1 != 6) { // js ===, java. == !=.
//            System.out.println("6이 안 나왔습니다!");
//        }
        while (true) {
            int dice = rd.nextInt(6) + 1;
            System.out.println("주사위에서 " + dice + "가 나왔습니다!");
//            if (dice == 6) {
//                System.out.println("6이 나왔으므로 종료");
//                break; // 루프를 중지시키는 키워드 -> break.
//                // switch -> 다음 단계로 넘어가지 않게... <-> 반복(while, for) 정지
//            }
            if (dice != 6) {
                System.out.println("6이 나오지 않았으므로 루프 반복");
                continue; // 지금까지 진행되던 걸 더이상 진행하지 않고 '다음 루프로 이동'
                // 조건식을 다시 평가하도록 이동.
            }
            break;
        }
    }
}