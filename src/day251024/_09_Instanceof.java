package day251024;

import java.util.ArrayList;
import java.util.List;

// instanceof
public class _09_Instanceof {
    public static void main(String[] args) {
        System.out.println(getMachine() instanceof Machine);
        System.out.println(getMachine() instanceof List);

        ArrayList<Integer> list = new ArrayList<>();
        // List -> 인터페이스 => 실제로 자료구조로 구현한 구현체.
        // List의 아래에 ArrayList.
        System.out.println(list instanceof List); // 다형성.
        // 자바의 핵심이 된다
        // List 약속 <- ArrayList, LinkedList (여러 방법 선택)
        // 제너릭(<?>), 캐스팅(형 변환 -> 데이터 타입 변경)
    }

    static Machine getMachine() {
        return new Machine();
    }
}

class Machine {

}