package day251024.p2;

import day251024.p1.ParentClass;

public class ChildClass extends ParentClass {
    public ChildClass() {
//        pv; // private로 해서 접근 X
//        dt; // default <-
        System.out.println(pt); // protected
        System.out.println(pb); // 접근 가능

    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println(child.pb);
        System.out.println(child.pt);
        ParentClass parent = new ChildClass();
        System.out.println(parent.pb);
        // protected -> 상속받은 객체 내부와 같은 패키지 경로에서만 사용할 수 있게.
//        System.out.println(parent.pt);
    }
}
