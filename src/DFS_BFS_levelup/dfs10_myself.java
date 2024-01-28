package DFS_BFS_levelup;
import java.util.*;

public class dfs10_myself {
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};
    public static int[][] board= new int[8][8];
    public static int count=0;

    public static void DFS(int x, int y) {
        if(x==7 && y ==7) count++;
        else{
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if ((1 <= nx && nx <=7) && (1<= ny && ny <=7) && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        /*
        * board[1][1] = 1; 을 안하면
        * 다시 되돌아와서 다른쪽으로 넘어가게 되어 총 횟수의 2배가 된다.
        * 직접 해보면 이해가 됨
        * 1,1에서 1,2로 갔다가 다시 1,1 로 올 수 있다는 뜻
        * */
        board[1][1] = 1;
        DFS(1, 1);
        System.out.println(count);






/*        for (int[] arr : board) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }*/

    }
}
