package day251023;

import java.util.Arrays;

// 문자열 상세
public class _02_StringMethod {
    public static void main(String[] args) {
        // 문자열 -> 내장 메서드
        String text = "programming";
        System.out.println(text.length());
        System.out.println(System.identityHashCode(text)); // 새롭게 만들어서 '다르다'
        // 배열 -> length => 고정된 속성. <-> JS. length => 심지어 임의로 수정할 수도 있음
        // length() <- 메서드.
        // (다른 자료구조의 경우) size()
        text += " is good";
        System.out.println(text.length());
        System.out.println(System.identityHashCode(text)); // immutable 하다

        // 문자열 합치기 (concat, +)
        String front = "Hello, ";
        String back = "world!";
        System.out.println(front.concat(back));
        System.out.println(front + back);

        // 문자열 부분추출 (substring <- sub/string)
        String text2 = "Java is Good!";
        // 오버로딩 -> 같은 메서드 이름인데 매개변수 조합에 따라 다른 호출
        System.out.println(text2.substring(8)); // 시작점부터 끝까지
        System.out.println(text2.substring(5, 8)); // 시작점(포함) - 끝점(미포함)
        System.out.println(text2.substring(0, 4)); // 시작점(포함) - 끝점(미포함)

        // 문자열 -> 배열. 인덱스 기반하여서 해당 위치를 반환
        String text3 = "java"; // 0: char j, 1: char a, 2: ...
        // char[]
        // ( ) char charAt(index) -> return type char
        System.out.println(text3.charAt(1));
        char c = text3.charAt(2);
        System.out.println(c);
//        String s = text3.charAt(3); // charAt -> String 타입에 할당 X.
        // javascript -> text[index]
        // java -> 인덱스 호출 X. text.charAt()

        // 문자, 문자열 위치 찾기
        String text4 = "java is difficult";
        System.out.println(text4.indexOf('i')); // char, "i"
        // 맨 처음 해당 문자/문자열이 등장하는 위치
        System.out.println(text4.indexOf("cult")); // string.
        System.out.println(text4.indexOf("?")); // 없을 경우에는 -1.
        // 처음 등장한다 -> regular expression (regexp) 정규표현식 (여러번 특정 패턴이 등장하는 경우)

        String text5 = "         a            "; // 이걸 substring?
        System.out.println(text5.trim()); // trimmer
        // trim**, strip -> 공백등을 처리하는 대표적인 이름

        // 대문자, 소문자 일괄 변화
        String text6 = "I like Book";
        System.out.println(text6.toLowerCase());
        System.out.println(text6.toUpperCase());

        // 문자열을 특정 패턴을 기준으로 '분리' -> 결과물 String[]
        String data = "java;js;html";
        System.out.println(data.split(";")); // regex : 정규표현식, 패턴
        for (String v : data.split(";")) {
            System.out.println(v);
        }
        // 배열으로 나오는 것의 장점 -> index를 바로 써서...
        System.out.println(data.split(";")[1]);
        // 결과물이 '배열'이라는 걸 의식.
        System.out.println(Arrays.toString(data.split(";")));

        // 교체
        String text7 = "Java is fun, Java is great";
        // java != Java (대소문자 확실히 해서...)
        System.out.println(text7.replace("java", "js"));
        System.out.println(text7.replace("Java", "JS"));
        // Java -> 전체 대체. => 아예 전체 대체.
        System.out.println(text7.replaceFirst("Java", "JS"));
        // 첫번째 등장하는 것만 대체
        // 정규표현식을 써서 매칭되는 모든 것
        // \s -> 스페이스
        // 일반 단어로 인식
        System.out.println(text7.replace("\\s", "JS"));
        // 정규표현식으로 인식
        // https://regexr.com/
        // https://regex101.com/
        System.out.println(text7.replaceAll("\\s", "JS"));
        // replaceFirst, replace -> 단어. String 자체
        // replaceAll -> 정규표현식

        // 포함 여부 (contains)
        System.out.println(text7.contains("great"));
        System.out.println(text7.contains("best"));

        // 포맷.
        // %s, %d, %f... -> %s. %d.
        // %s : string
        // %d : digit -> 10진수 (정수 숫자)
        // %f : float -> 실수형
        String f = "이름 : %s, 나이 : %d, 키 : %f";
        System.out.println(f.formatted(
                "김자바", 20, 200.2
        ));
        System.out.printf(f + "\n", "김자바", 20, 200.2);
        // String -> concat, +. 연결.
        // formatted -> 함수, 리터럴, 값 -> '대체'

        // Java15 text block
        // """ """ <- JS `` 유사하지만 -> 변수를 파싱
        String block = """
                 ", ', ...
                 ${...} 이런 기능은 없음.
                 %s
                 """.formatted("안녕하세요!");
        System.out.println(block);
        // JSON -> 직접 입력하거나, 포맷된 문자열. (특정 자리에 변수등을 이용한 값 넣기)

        // 이스케이프
        System.out.println("\""); // 문자열 내부에 "를 써야한다
        // text block / \ <- 역슬래시.
        System.out.println("\n, \t, \\"); // \n : 줄바꿈, \t : 탭, \\ : 역슬래시 표시
        // -> 기능을 가지고 있는 문자.

    }
}