package DFS_BFS_levelup;
import java.util.*;

public class pratice_myself {
    public static int n,m;
    public static Integer[] arr;
    public static int answer = Integer.MAX_VALUE;
    public static void DFS(int L, int sum) {
        if(sum > m) return;
        if(L>= answer) return;
        if(sum == m){
            answer = Math.min(answer, L);
        }else if (sum < m){
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        m = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        DFS(0, 0);
        System.out.println(answer);
    }
}

