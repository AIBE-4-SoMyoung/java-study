package day251029;

// try-catch-finally
public class _02_TryCatchFinally {
    public static void main(String[] args) {
        // 허락보다 용서가 쉽다
        // EAFP (It's Easier to Ask Forgiveness than Permission)
        // 오류를 사용해서 catch를 해서 로직 구현하는 것
        // throw(raise) -> catch
        // <-> LBYL (Look Before You Leap)
        // 가능한한 if문을 사용을 해서 에러가 날 수 있는 부분을 분기처리
        // 흐름제어, return -> if문 처리를 하면 메서드/함수 단위에서 할 수 있는게 많이 좁아짐.
        // try-catch
        String s = "";
        try {
            int v = 0;
            System.out.println(1 / 0);
            s = "111"; // 중간에 에러가 나면 도달할 수 X.
            System.out.println(1 / 0);
        } catch (Exception e) {
            // 로그를 남긴다 (print)
        } finally { // 문법적 의미.
            // 무조건 실행
            // 여기서 실행하나
        }
        // 여기서 실행하나...?
        System.out.println(s);
        // v <- scope. try/catch문 내에서 쓴 경우에는 변수가 블록 내부의 '지역변수' <- 바깥에서 쓸 수가 없음.
        System.out.println(run());
    }

    static int run() {
        // try-catch, try-finally, try-catch-finally
        try {
            return 1;
        } finally {
            System.out.println("리턴이 나오더라도 finally 구문은 무조건 실행");
            return 2; // 리턴이 덮어씌워짐
        }
    }
}

