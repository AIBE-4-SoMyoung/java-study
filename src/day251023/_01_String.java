package day251023;

// String
public class _01_String {
    public static void main(String[] args) {
        // String
        // -> 원시타입 X.
        // Java -> char (1글자 짜리 문자)
        // 문자열 -> String (줄.현)
        // C언어 => char[].
        // 참조타입 -> 클래스를 통해 만들어짐. 주소값.
        // => 유용한 메서드. 속성값.

        // 불변 (immutable) -> 문자열은 수정되지 X.
        // 실제로는 매번 새로운 별도의 문자열을 만드는 개념.

        // " " -> 리터럴 방식
        System.out.println("자바");
        // JVM <- Java Virtual Machine (실행환경)
        // (리터럴 방식의) 문자열을 저장해놨다가 재사용.
        String s1 = "자바"; // 편집툴에서 직접 문자열을 리터럴로 입력 -> 효율적 사용을 위해 저장
        String s2 = "자바";
        // 객체/참조 -> 주소값.
        // 주소값
        // System.identityHashCode(...)
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        // new 키워드
        String s3 = new String("자바");
        // 새로 적어다가 생성하는 방식 -> 일반적으로 외부에서 String을 받으면... (DB, Fetch, File)
        System.out.println(s1 + " " + s2 + " " + s3);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        // 개발하는 과정에서 비교나 확인을 위해 입력한 문자열은
        // 외부에서/생성되서 받은 문자열과 '다른 출처'일 가능성.
        // 자바스크립트에서 ==. ===. -> 알아서 타입변환, 넓게 (true, false하다...) 인정하는 값들 때문에 문제...
        // 자바 -> 동등비교 ==, != 가 (참조/객체 타입의 경우) 별도로 설정이 없다면 '주소값'을 비교한다.
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        // ==, != -> 주소값 비교 (객체)
        // equals -> 값이 같은지 비교하는 내장 메서드
        System.out.println(s1.equals(s3));
        // 초반부에 많이 틀리는 이슈.
    }
}