package DFS_BFS_levelup;
import java.util.*;

public class ac2579 {
    public static int[] dp,arr;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) arr[i] = sc.nextInt();

        dp[1] = arr[1];
        if(n>=2) dp[2] = arr[1] + arr[2]; //n==1일 경우 방지

        for (int i = 3; i <= n; i++) { //n==1이면 어차피 반복문 실행 안됨.
            dp[i] = arr[i] + Math.max(arr[i - 1] + dp[i - 3], dp[i - 2]);
        }

        System.out.println(dp[n]);
    }
}
