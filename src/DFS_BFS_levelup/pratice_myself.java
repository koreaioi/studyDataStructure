package DFS_BFS_levelup;
import java.util.*;

public class pratice_myself {
    public static int n,m;
    public static int[] arr;

    public static void DFS(int L) {
        if (L == m) {
            for(int x : arr) System.out.print(x + " ");
            System.out.println();
        }else {
            for (int i = 1; i <= n; i++) {
                arr[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        DFS(0);

    }
}

