package day251024;

import dev.Data1; // 외부 패키지 경로에서 불러오는 경우

// 접근제어자, 접근자
public class _04_AccessModifier {
    // public (default), private, protected -> 접근제어자
    // static -> 스태틱 메모리
    public static void main(String[] args) {
        // public 없으면 main 메서드 불가
        // public <- 공개(완전공개) <- 패키지, 모듈의 경계를 '무시'
        // src -> java. 폴더(패키지)
        Data1 d1 = new Data1();
//        Data2 -> public 되어 있지 않으면 패키지 경계를 넘을 수가 없음
        // 접근하면 안되는 코드에 대한 접근 방지.
//        d1.test() -> public이 안붙어서.
        d1.test2(); // 메서드에도 접근제어자가 붙는구나.
        Data3 d3 = new Data3();
        System.out.println(d3.a); // public은 어디에서나 상관없고
        System.out.println(d3.b); // default는 같은 파일, 패키지
//        System.out.println(d3.c); // private -> 같은 클래스 내부에서만...
        // getter, setter
        Example e = new Example();
//        e.val; // 호출 X
        e.setVal(100);
        System.out.println(e.getVal());
    }
}

class Data3 {
    // 같은 패키지의 클래스지만 내부에 인스턴스변수나 메서드에 접근 X.
    public int a;
    int b;
    private int c; // 외부에서 접근 금지
}

class Example {
    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    // record -> 이미 getter 를 구현한.
    // lombok -> @(표시만 달아주면) 런타임 단계에서 getter/setter를 만들어주게 할 수 있음.

    //    public int val; // 어느 코드에서도 다 사용이 가능하고, 별도의 '검증'을 넣어줄 수가 없음.
    private int val2;
    private int val; // 호출할 수가 없음
    public int getVal() { return val;} // getter.
    public void setVal(int newVal) {
        // 양수만 넣고 싶다
        // newVal > 0 => if 조건문
        // System.out.println() <- 메시지를 남기고 싶다...
        val = newVal; // 멤버변수를 패러미터를 받아서 바꿔주는 접근자.
    }
}