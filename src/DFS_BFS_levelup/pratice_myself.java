package DFS_BFS_levelup;
import java.util.*;


public class pratice_myself {
    public static int n; //문제 수
    public static int limit; //제한 시간
    public static int[][] arr; //문제와 푸는 시간을 담은 배열
    public static int answer=0;//답

    public static void DFS(int L, int sum, int time) {
        if(time > limit) return;
        if(L==n)answer = Math.max(answer, sum);
        else{
            DFS(L + 1, sum + arr[L][0], time + arr[L][1]);
            DFS(L + 1, sum, time );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        limit = sc.nextInt();
        arr = new int[n][2]; //[][0]이 문제 [][1]이 시간
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        DFS(0, 0, 0);
        System.out.println(answer);
    }
}
