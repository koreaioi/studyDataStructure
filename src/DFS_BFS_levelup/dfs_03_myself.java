package DFS_BFS_levelup;
import java.util.*;

public class dfs_03_myself {
    public static int n; //문제 수
    public static int m; //제한 시간
    public static int[][] arr;
    public static int max = 0;


    public static void DFS(int level, int sum, int sumOfTime) {
        if(sumOfTime > m) return;
        if(level == n){
            max = Math.max(max, sum);
        }else{
            DFS(level + 1, sum + arr[level][0], sumOfTime + arr[level][1]);
            DFS(level + 1, sum, sumOfTime);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        DFS(0, 0, 0);

        System.out.println(max);

    }
}
