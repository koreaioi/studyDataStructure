package DFS_BFS_levelup;
import java.util.*;

public class pratice_myself {
    public static int n,m;
    public static int[] arr, ch,pm;

    public static void DFS(int L) {
        if (L == m) { //출력
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) { //i가 아직 사용하지 않았을 경우
                    ch[i] =1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0; //호출한 DFS가 끝나면 다시 체크 배열을 롤백
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

/*      // test
        for(int x: arr) System.out.print(x+ " ");*/


    }
}

