package day251029;

import java.net.http.HttpClient;

// 예외처리
public class _01_ExceptionHandling {
    public static void main(String[] args) {
        // 흐름제어, '타입' - 클래스.
        // JS -> Java => 메서드 시그니쳐 + throws

        // try
        // 언체크 (Unchecked Exception)
        // 실행(런타임) 과정에서 발생되기에 사전 체크 X.
        int v1 = 1;
        int v2 = 0;
        // if문을 사용해서 분기 처리
        if (v2 != 0) {
            System.out.println(v1 / v2);
        }
//        System.out.println(1 / 0);
//        System.out.println(v1 / v2);
        // java.lang.ArithmeticException: / by zero
        String s = null; // null이 나오면
        // java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
        // Null Safety Issue
        if (s != null) {
            System.out.println(s.length());
        }
        System.out.println("이후 로직");
        try {
            // 처리를 안하게 되면 -> 실행을 중단하고 stacktrace(에러로깅)
            System.out.println(v1 / v2);
            s.length();
        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
            ex.printStackTrace();
            System.err.println(ex.getMessage());
            ; // 에러가 나게 된 과정과
            // 참고했던 여러 클래스 파일
        }
        // 체크 (Checked Exception) <- 무조건적으로 처리하게 만드는 예외
        // JS -> 컴파일 작업이 없어서 잡아낼 수 없음 (런타임 예외만 있다)
        // Java -> 실행코드 '컴파일' => '이건 무조건 신경 써야하는데...'
        HttpClient client = HttpClient.newHttpClient();
        // java.io.IOException, java.lang.InterruptedException
        // 1) 지금 처리 try-catch 2) 상위 메서드에 처리를 '위임' throws
        try {
            client.send(null, null);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}