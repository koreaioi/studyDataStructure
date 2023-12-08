package Algorythm_Array;

import java.util.Scanner;

public class Array04_solution {
    public static void solution(int n) {
        int a=1, b=1, c;
        System.out.print(a +" " + b +" ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        solution(n);
    }
}
