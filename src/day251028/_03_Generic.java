package day251028;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// Generic
// 제네릭 -> 컴파일 할 동안에만 존재하고 아닌 경우에는 상위 타입으로 '소거'
public class _03_Generic {
    public static void main(String[] args) throws NoSuchFieldException {
        // 들어갈 데이터의 타입이 고정적이지 않을 경우
//        List list = new ArrayList();
        List<Integer> list = new ArrayList<>(); // 어떠한 타입이 들어갈지를 명시
        // 컴파일-compile 단계에서 체크. (<-> 런타임-runtime 환경)
//        list.add(1.0);
//        list.add(1);
        // 제네릭 : 클래스나 메서드를 작성할 때 처할 데이터 타입을 '매개변수'화 -> 다양한 타입
        GenericBox<Integer> box = new GenericBox<>(100);
        // 타입 소거 <- Integer <= Number
        Class<?> boxClass = box.getClass();
        Field itemField = boxClass.getDeclaredField("data");
        System.out.println(itemField.getType());
        // class java.lang.Number
        // <T extends T2> : T2를 상속받은 객체들만 들어갈 수 있게 bound
//        GenericBox<String> box2 = new GenericBox<>("100");
        int val = box.getData();
//        String val2 = box2.getData();
        GenericBox.util("100");
        GenericBox.util(1);

        // 모든 클래스는 Object 최상위 클래스를 상속하는 건데... 너무 당연해서 표시 X
    }
}

// 맨 위 <T>
// 타입 소거 주의
//class GenericBox<T extends Number> { // <> <- 전달
class GenericBox<T> { // <> <- 전달
    private T data;
    public GenericBox(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
    // 메서드 <T>를 넣으면...
    public static <T2> void util(T2 element) {
        System.out.println(element);
    }
}