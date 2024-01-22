package DFS_BFS_levelup;

import java.util.Scanner;

public class dfs_06_myself {
    public static int[] arr;
    public static int[] ch;
    public static int[] pm;
    public static int n;
    public static int m;

    public static void DFS(int L) {
        if (L == m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for (int i = 0; i < n; i++) {
                if(ch[i]==0) {
                    pm[L] = arr[i];
                    ch[i] = 1;
                    DFS(L +1);
                    ch[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        pm = new int[m];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        DFS(0);


    }
}
