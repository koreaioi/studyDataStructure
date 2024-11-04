package solvedac;

import java.util.Scanner;

public class ac2193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[91]; // 1 <= n <= 90

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for(int i = 2; i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[n]);
    }
}
