package model;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
//        System.out.println(a.v1); private X.
        System.out.println(a.v2);
        System.out.println(a.v3);
        System.out.println(a.v4);
        // 같은 패키지 내에 경로라면 private는 제외하고
        // protected, (default), public
    }
}