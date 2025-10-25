package day251022;

import java.util.Arrays;

public class _11_ArrayPrint {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        int[] arr2 = {6, 7, 8, 9, 10};
        System.out.println(arr1); // 주소값
        System.out.println(arr2);
        // 주소값이 아니라 포함된 원소들의 순서와 값들을 표현
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        // 2차원 배열
        int[][] arr3 = new int[5][5];
        // int[] -> {0, 0, 0, 0, 0}
        // int[] -> {0, 0, 0, 0, 0}
        // int[] -> {0, 0, 0, 0, 0}
        // int[] -> {0, 0, 0, 0, 0}
        // int[] -> {0, 0, 0, 0, 0}
        arr3[0][0] = 1;
        arr3[2][2] = 3;
        arr3[4][4] = 5;
        int[][] arr4 = { // int[3][3]
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        System.out.println(arr3); // 주소값
        System.out.println(arr4);
        // 해당 배열은 내부 값 -> 배열에 배열을 담음
        // 1차적으로는 문자열로 표현이 되지만, 그 내부에 있는 배열
        // 주소값.
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        // deepToString -> 한 층 더 내려가 속에 있는 값.
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.deepToString(arr4));
        // 3차원 배열도 존재? -> n차원.
        int[][][] arr5 = new int[5][5][5];
        int[][][] arr6 = {
                {{1}, {1}, {1}, {1}}
        };
        System.out.println(Arrays.deepToString(arr5));
        System.out.println(Arrays.deepToString(arr6));

        // arr3, arr4
        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(Arrays.toString(arr3[i]));
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.println("i : " + i + " j : " + j + " v : " + arr3[i][j]);
            }
        }
        for (int i = 0; i < arr4.length; i++) {
//            System.out.println(Arrays.toString(arr3[i]));
            for (int j = 0; j < arr4[0].length; j++) {
                System.out.println("i : " + i + " j : " + j + " v : " + arr4[i][j]);
            }
        }
    }
}
