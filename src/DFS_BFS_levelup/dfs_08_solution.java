package DFS_BFS_levelup;

import java.util.Scanner;

public class dfs_08_solution {
    public static int n;
    public static int f;
    public static int[] ch;
    public static int[] arr;
    public static int[] comb;
    public static int[][] memo = new int[35][35];

    public static int Combination(int n, int r) {
        if(memo[n][r] > 0) return memo[n][r];
        if (n==r || r ==0) return 1;
        else return memo[n][r] = Combination(n - 1, r - 1) + Combination(n - 1, r);

    }

    public static void DFS(int L, int sum) {
        if(L==n){
            if(sum==f) {
                for(int x : arr) System.out.print(x + " ");
                System.exit(0);
            }
        }else{ //갈래 뻗어서 순열로..
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 0){ //i(1~n)를 아직 사용안했으면
                    ch[i] = 1;
                    arr[L] = i;
                    DFS(L + 1, sum + (comb[L] * arr[L]));
                    ch[i] =0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        ch = new int[n+1];
        comb = new int[n];
        arr = new int[n];
        for (int i = 0; i < n; i++) comb[i] = Combination(n - 1, i);

        DFS(0, 0);

    }
}
