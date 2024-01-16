package DFS_BFS_levelup;

import java.util.Scanner;

//부분 집합을 DFS로 다루기
public class dfs_02_myself {
    public static int w; //무게
    public static int[] arr; //마리
    public static int n;
    public static int max=0;

    public static void DFS(int L, int sum) {
        if(sum > w) return;
        if (L==n) {
            max = Math.max(max, sum);
        } else  {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int sum = 0;

        DFS(0, sum);

        System.out.println(max);
    }
}