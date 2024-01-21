package DFS_BFS_levelup;

import java.util.Scanner;

public class dfs_04_solution {
    public static int n;
    public static int m;
    public static int[] pm;

    public static void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1); //이게 끝나고 다시 반복문
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];

        DFS(0);



    }
}
