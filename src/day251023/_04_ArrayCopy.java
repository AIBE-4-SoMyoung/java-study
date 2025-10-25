package day251023;

import java.util.Arrays;

// 배열의 복사
public class _04_ArrayCopy {
    public static void main(String[] args) {
        // 배열 <-> JS 배열
        // 1. 길이를 정하면 바꿀 수 없다
        // 2. 자료형이 일치해야한다
        // -> 속도 빠른 편
        String[] lang1 = new String[3];
        lang1[0] = "한국어";
        lang1[1] = "영어";
        lang1[2] = "일본어";
        System.out.println(lang1); // 주소값.
        System.out.println(System.identityHashCode(lang1)); // 주소값.
        String[] lang2 = {"한국어", "영어", "일본어"};
        System.out.println(lang2); // 주소값.
        System.out.println(System.identityHashCode(lang2)); // 주소값.
        System.out.println(Arrays.toString(lang1));
        System.out.println(Arrays.toString(lang2));

        // 할당. (JS -> 재할당, 얕은복사, 깊은복사)
        String[] lang3 = lang1;
        System.out.println(System.identityHashCode(lang1));
        System.out.println(System.identityHashCode(lang3));
        lang3[2] = "중국어";
        System.out.println(Arrays.toString(lang1));
        System.out.println(Arrays.toString(lang3));
        String[] lang4 = Arrays.copyOfRange(lang3, 0, lang3.length);
        System.out.println(System.identityHashCode(lang3));
        System.out.println(System.identityHashCode(lang4));
        System.out.println(Arrays.toString(lang3));
        System.out.println(Arrays.toString(lang4));
        lang3[2] = "독일어";
        System.out.println(Arrays.toString(lang1));
        System.out.println(Arrays.toString(lang3));
        System.out.println(Arrays.toString(lang4));

        // 이중배열
        int[][] arr1 = {{1, 2, 3}, {1, 2, 3}};
        int[][] arr2 = arr1; // 얕은 복사(주소값) 재할당.
        int[][] arr3 = Arrays.copyOfRange(arr1, 0, arr1.length); // 깊은 복사? <- 얕은 복사.
        arr1[0][2] = 100;
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        // int[]은 새로 만들어진게 맞는데... int[][] <- 이미 존재하던 배열을 복사한 개념.
        System.out.println(Arrays.deepToString(arr3));
        int[][] arr4 = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            arr4[i] = Arrays.copyOfRange(arr1[i], 0, arr1[i].length);
        }
        arr1[0][1] = 1234;
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.deepToString(arr4));
        // 아예 처음부터 모든 for문 돌려서 원시값 레벨에서 복사하거나 객체 -> clone (기능을 바꿔서) 처리.
    }
}