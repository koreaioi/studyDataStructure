package solvedac;

import java.util.Scanner;

public class ac1978 {
    public static boolean isPrime(int n) {
        if(n==1) return false;
        if(n == 2) return true;
        //i * i < n 도 가능
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(isPrime(sc.nextInt())) count++;
        }
        System.out.println(count);

    }
}
