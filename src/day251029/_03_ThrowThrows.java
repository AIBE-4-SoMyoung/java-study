package day251029;

import java.util.Random;

// throw/throws, 예외의 상속, 멀티캐치
public class _03_ThrowThrows {
    public static void main(String[] args) {
//    public static void main(String[] args) throw Exception {
        // throw/throws
//        getValue2();
        try {
            getValue();
        } catch (Exception e) {
//            throw new RuntimeException(e); // IntelliJ <- throw new Runtime...
        }

        try {
            Random rd = new Random();
            if (rd.nextBoolean()) {
                throw new MyException("1", "2");
            } else {
                throw new MyRuntimeException();
            }
            // 가장 상위인 Exception이 위에오면 뒤에는 도달할 수 없음.
//        } catch (Exception e) { // 업캐스팅.
        } catch (MyException e) {
            // 특정한 타입일 때 처리하는 블록
            System.out.println("MyException (멀티캐치)");
        } catch (MyRuntimeException e) {
            System.out.println("MyRuntimeException (멀티캐치)");
        } catch (RuntimeException e) {
        } catch (Exception e) {
            System.out.println("구분하기 쉽지 않음");
            if (e instanceof MyException) {
                System.out.println("MyException");
            } else if (e instanceof MyRuntimeException) {
                System.out.println("MyRuntimeException");
            }
        }
    }

    //    static void useMyException() throws Exception {
    static void useMyException() throws MyException {
        throw new MyException("안녕!", "나는 에러야");
//        try {
//            throw new MyException();
//        } catch (Exception e) {
//
//        }
    }

    static void useMyRuntimeException() {
        throw new MyRuntimeException(); // 영향이 X.
    }

    // {} 앞에 부분 -> 메서드 시그니쳐 -> throws (체크 예외)
    // throws Exception -> 이 메서드는 체크 예외 계열을 가지고 있습니다 -> 상위 메서드에서 여전히 해당 Exception을 상위로 throws하거나 아니면 try문으로 묶어주셔야합니다
    static int getValue() throws Exception { // integer (객체로 만들어서 null 전달은 가능ㅎ은 함 -> 바람직하지 않음)
        // 무언가 잘못됐다!
        Random rd = new Random();
        if (rd.nextBoolean()) { // 이 안에서 처리하면 어차피 return 제약에 걸리게 된다
            throw new Exception("예외 발생!"); // 체크 예외/ 언체크 예외
        }
        return rd.nextInt();
    }
    static int getValue2() { // integer (객체로 만들어서 null 전달은 가능ㅎ은 함 -> 바람직하지 않음)
        // 무언가 잘못됐다!
        Random rd = new Random();
        if (rd.nextBoolean()) { // 이 안에서 처리하면 어차피 return 제약에 걸리게 된다
//            throw new Exception("예외 발생!"); // 체크 예외
            throw new RuntimeException("예외 발생!"); // 언체크 예외
            // 체크 예외만 컴파일 과정에서 try문을 강제
        }
        return rd.nextInt();
    }

    // Exception
    // throw -> 체크/언체크.
}

class MyException extends Exception {
    final String name;
    // 생성자 안만들어주면 기본 생성자 -> 클래스이름()
    MyException(String message, String name) {
//        super();
//        super("메시지");
        super(message);
        this.name = name;
    }
    // 메서드를 만들 수도 있는... 접근자들 주로 만드는 편...
}

class MyRuntimeException extends RuntimeException {

}
