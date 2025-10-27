package model; // 경로. 소속된 묶음. -> 같은 패키지 내부에 있으면 충돌.

public class Animal {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.v1);
        System.out.println(a.v2);
        System.out.println(a.v3);
        System.out.println(a.v4); // 같은 클래스 -> 접근제어자와 상관없이 호출 가능
    }

    // class 접근제어자 -> 어디서나 접근할 수 있는 public, 같은 패키지 내에서만 접근이 되는 (default)
    private String v1;
    protected String v2;
    String v3;
    public String v4;
}