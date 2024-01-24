package DFS_BFS_levelup;

import java.util.Scanner;

public class dfs_07_myself {
    public static int n;
    public static int r;

    public static int[][] memo;

    public static int Combination(int n, int r) {
        if(memo[n][r] > 0) return memo[n][r];
        if(n==r || r==0) return 1;
        else return memo[n][r] = Combination(n - 1, r - 1) + Combination(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        memo = new int[n+1][r+1];

        int combination = Combination(n, r);
        System.out.println(combination);


    }
}
