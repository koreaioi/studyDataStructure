package DFS_BFS_levelup;
import java.util.*;

public class dfs09_myself {
    public static int n;
    public static int m;
    public static int[] arr;

    public static void DFS(int L, int start) {
        if (L == m) {
            for (int x : arr) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = start; i <= n; i++) {
                    arr[L] = i;
                    DFS(L + 1, i+1);
                }
            }
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        DFS(0, 1);

    }
}
