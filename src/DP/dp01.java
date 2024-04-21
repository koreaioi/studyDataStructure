package DP;

import java.util.Scanner;

public class dp01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        // 전단계의 경우의수 에서 +1칸 하는경우 + 전전단계의 경우의 수에서 +2칸 하는경우
        for (int i = 3; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        System.out.println(dp[n]);
    }
}
