package Algorythm_Array;

import java.util.Scanner;

public class Array03 {
    public static void solution(int[] a, int[] b, int n) {
        for (int i = 0; i < n; i++) {
            if(a[i] <= b[i]){
                if(a[i]==b[i]) {System.out.println("D"); continue;}
                else if(b[i]==3 && a[i]==1) {System.out.println("A"); continue;}
                System.out.println("B");
            }else{
                if(a[i]==3 && b[i]==1) {System.out.println("B"); continue;}
                System.out.println("A");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        solution(a, b, n);

    }
}
