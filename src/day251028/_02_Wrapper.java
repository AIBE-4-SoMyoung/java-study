package day251028;

// Wrapper
// 기본(원시) 타입 -> 객체 X -> Generic 쓰기 위해서 편의상 만들어놓은 참조타입
public class _02_Wrapper {
    public static void main(String[] args) {
        // boxing
        // box (wrap)
        // auto-boxing, auto-unboxing
        int value = 10;
        // byte, short, int, long
        // float, double, char, boolean (String은 원시 타입 X)
        // Integer(int)/Character(char) 제외한 나머지들은
        // Boxing을 위한 Wrapper 클래스가 파스칼케이스(맨앞이 대문자고 스페이스가 있을 때 대문자로 변경)[
//        Byte, Short, Boolean, Float, Double, Long
//        Integer, Character
        Integer wrap = value; // 그냥 넣으면 알아서 바뀌어준다
        int value2 = wrap; // 자동 언박싱을 해준다
        // 기본 -> 제너릭
//        Integer.스태틱메서드 -> 유틸리티 => 편의성을 위해서 존재하는 메서드
        // 1. 제너릭 등을 위해 기본타입을 클래스화 참조화하는 기능
        // 2. 기본타입과 관련하여 변환이나 부가기능을 위한 static 메서드들이 들어있다
    }
}