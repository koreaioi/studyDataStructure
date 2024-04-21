package DP;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class dp03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = sc.nextInt();

        int max =1;
        for (int i = 1; i <= n; i++) dp[i] = 1;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                if(arr[k] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[k] + 1);
                }
            }
        }
        // steam.max()는 시간 복잡도 O(n)
        int result = Arrays.stream(dp).max().getAsInt();

        System.out.println(result);

    }
}
