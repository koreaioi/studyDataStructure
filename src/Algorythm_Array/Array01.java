package Algorythm_Array;

import java.util.Scanner;

public class Array01 {
    public static void solution(int[] intArr) {
        System.out.print(intArr[0] + " ");
        for (int i = 1; i < intArr.length; i++) {
            if(intArr[i] > intArr[i-1]) System.out.print(intArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        solution(intArr);
    }
}
