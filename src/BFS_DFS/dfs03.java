package BFS_DFS;
import java.util.*;

public class dfs03 {
    public static int dfs(int n) {
        if(n==1) return 1;
        else return n * dfs(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(dfs(n));

    }
}
