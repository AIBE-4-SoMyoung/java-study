package day251027;

// 05_추상 클래스
public class _05_AbstractClass {
    public static void main(String[] args) {
        // 1. 작업을 위한 데이터 (속성-프로퍼티) + (절차-프로시저) => 인스턴스로 찍어내기 위한 설계도
        // 2. 다형성(Polymorphism) - 데이터의 분류 방식
        // -> 상속관계, 포함관계 => A is B (백엔드 개발자는 개발자다) 개발자 > 백엔드 개발자
        // '개발자' <- 백엔드 개발자, 프런트엔드 개발자, 인프라 개발자, DB 개발자 <= 포괄하기 위해서만 존재하는 것
        // 굳이 '다 작성되어 있을 필요가 없다'. 공통적으로 추상화된 (바로 사용가능하게 표준화된) 부분만 있으면 된다

        // 추상화
//        Developer dv = new Developer(); // 추상화된 메서드에 대한 '구현'이 필요한 상태
        Developer be = new BackendDeveloper(); // 주로 '타입'으로만 사용함
        Developer fe = new FrontendDeveloper();
        // 사장님 입장 -> 개발을 몰라요 -> 둘다 같은 '개발자'
        be.develop();
        fe.develop();
    }
}

// 스스로 '생성'할 수 없음. -> 생성자가 없음
abstract class Developer {
    //class Developer {
    // 동적 바인딩 <- 오버라이딩 시에 하위(자식)클래스의 해당 메서드를 사용 (안에서 super로 쓸게 아니면...)
    // 반환타입, 이름, 메서드 시그니쳐 -> 매개변수.
//    public void develop() {
//
//    }
    // 생성자는 만들 수 있으나 new로 생성하지 못함
    Developer() {

    }

    abstract public void develop();
    // 메서드의 {} 내부는 만들지 않고, 일종의 '약속'으로만 존재.

    // 이미 구현된 메서드를 가질 순 있음
    public void hello() {
        System.out.println("안녕하세요");
    }
}

// extends -> 클래스의 상속은 '1개씩만 가능'
class BackendDeveloper extends Developer {
    // 오버라이딩
    @Override
    public void develop() {
        System.out.println("백엔드 개발");
    }
}

class FrontendDeveloper extends Developer {
    @Override
    public void develop() {
        System.out.println("프런트엔드 개발");
    }
}