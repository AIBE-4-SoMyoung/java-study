package day251027;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 06_interface (인터페이스)
public class _06_Interface {
    public static void main(String[] args) {
        // 클래스의 '상속' <- extends, 1개씩, 다중상속 X.
        // 상황에 따라서 여러개를 섞어야될 수도 있지 않을까?
        Learner l = new BootCamper();
        Coder c = new BootCamper();
        List list = new ArrayList();
        List list2 = new LinkedList();
//        AbstractList list3 = new ArrayList();
        // 메서드나 기능등을 가지고 있는지...

        // 추상클래스 : 1개만. 일단 클래스기 때문에 new로만 못만든다 뿐이지 기본적인 class 역할은 다할 수 있고
        // 추가적으로 abstract method를 쓸 수 있는 개념
        // 인터페이스 : 여러개를 받을 수 있음. 로그. 여러 곳에서 공통적으로 발견될 수 있는. class 역할 다 못함. 기본적으로 abstract
        // 1.8 -> default

        // 추상클래스 vs 인터페이스 : '설계'
        // 가위 vs 절단기. -> 자른다는 역할은 비슷.
        // 1. 상위 타입으로 사용 가능 2. 추상 메서드를 부착가능 (하위 클래스가 공통을 만들어줘야하는)

        // 인터페이스를 '타입'으로 많이 쓰고
        // Abstract Class -> 세부 클래스를 만들기 전에 설계도.
    }
}

//abstract class Learner {
interface Learner {
    //    abstract void learn();
//    String name; // 초기화가 되지 않은 빈 멤버변수 X.
//    final String version = "1.0"; // 인터페이스에는 변수 없음. 상수임
    String version = "1.0"; // 인터페이스에는 변수 없음. 상수임
    void learn(); // 이미 추상화 되어 있음
    default void test() {

    } // 내부에 구현을 마친 메서드
}

//abstract class Coder {
interface Coder {
    //    abstract void code();
    void code();
}

//class BootCamper extends Learner, Coder { // 다중상속.
class BootCamper implements Learner, Coder {// 다중구현이 가능.
    @Override
    public void code() {

    }

    @Override
    public void learn() {

    } // 추상화된 메서드를 구현해라...
    // 하나만 소속된 걸 의미하는게 아니라, 구현해야하는 '기능'

}