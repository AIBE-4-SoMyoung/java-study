package day251023;

import java.util.Random;

// enum
public class _03_Enum {
    public static void main(String[] args) {
        // enumeration. 열거형
//        Coffee c = Coffee.AMERICANO;
//        Coffee c = Coffee.CAFE_LATTE;
        Coffee c = null;
        Random rd = new Random();
        int result = rd.nextInt(3);
        if (result == 0) {
            c = Coffee.AMERICANO;
        } else if (result == 1) {
            c = Coffee.CAFE_LATTE;
//        } else if (result == 2) {
        } else {
            c = Coffee.ICE_AMERICANO;
        }
        // 문자열, 숫자, Enum
        switch (c) {
            case AMERICANO:
                System.out.println("아메리카노 주문!");
                break;
            case CAFE_LATTE:
                System.out.println("라떼 주문!");
                break;
            case ICE_AMERICANO:
                System.out.println("아이스 아메리카노 주문!");
                break;
            default:
                System.out.println("주문 불가 메뉴!");
                break;
        }
    }
}

enum Coffee {
    // 구분되는 값 자체를 하나의 속성.
    // Coffee -> 하위타입.
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATTE
}