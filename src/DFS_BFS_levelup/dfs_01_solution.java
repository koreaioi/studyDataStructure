package DFS_BFS_levelup;
import java.util.*;

public class dfs_01_solution {
    public static int n;
    public static int[] arr;
    public static int total;
    public static boolean flag = false;
    public static String answer = "NO";

    public static void DFS(int L, int sum) {
        if (flag || sum > total / 2) return;
        if (L == n){
            if(sum == total/2){
                answer = "YES";
                flag = true;
            }
        }else{
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        total = Arrays.stream(arr).sum();

        DFS(0, 0);
        System.out.println(answer);
    }
}
