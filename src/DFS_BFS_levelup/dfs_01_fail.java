package DFS_BFS_levelup;

import java.util.Scanner;

public class dfs_01_fail {
    static int[] arr;
    static boolean[] ch;
    static int n;

    public static void DFS(int index) {
        //ch[index] = false 인상황
        DFS(index - 1);
        if (Calculate()) {
            System.out.println("YES");
            System.exit(0);
        }
        ch[index] = true;
        DFS(index - 1);
        if (Calculate()) {
            System.out.println("YES");
            System.exit(0);
        }

    }

    public static boolean Calculate() {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            if (ch[i] == false) sum1 += arr[i];
            else sum2 += arr[i];
        }

        if (sum1 == sum2) return true;
        else return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        ch = new boolean[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        if (Calculate()) System.out.println("true");
        else System.out.println(false);

        DFS(0);
    }
}
