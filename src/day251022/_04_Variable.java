package day251022;

// 변수, 상수, 데이터 타입
public class _04_Variable {
    public static void main(String[] args) {
        // 변수 -> 메모리에 지금까지 연산된 결과 혹은 내가 기록하고자 하는 리터럴(값)을 기입하는 것
        // 다시 불러올 때 어떠한 이름을 쓸지 정하는 것
        // 선언 - 대입(할당) / 초기화
        // 자바에서는 변수는 같은 스코프에서는 1번만 선언 가능. (선언은 이후 무조건 1번만 가능)
        // 할당 이후 재할당을 막는 변수 형태 -> 상수. final (constants) <-> js const
        // js const -> 쓰려고 하면 바로 초기화까지 해줘야함
        // final의 경우에는 필드로 쓸 경우에는 이후 생성자에서 할당해줘도 문제 없음.

        String text = "안녕하세요!";
        System.out.println(text); // 다른 메서드에 호출당하거나 연산 과정에서 호출되서 쓰이는 기능.
//        String text = "재선언은 불가"; // 같은 스코프일 경우에는...
        // 아예 컴파일 -> 실행 준비 자체를 안해준다
        text = "재할당은 가능하다";
        System.out.println(text);
        final String text2 = "재할당도 막자!";
//        text2 = "재할당도 막을 수 있다, 이 경우를 상수라고 한다";
        final String text3;
        text3 = "나중에 할당해주는게 가능은 하고...";
        System.out.println(text3); // 일반적으로는 나중에 넣을 경우에는 생성자나 외부의 주입 등의 형태로... try catch finally 한 번 사용하고 나서 외부에서 가져가서 쓸 수 있게...
    }
}