package solvedac;
import java.util.*;

public class ac7576 {
    static int[][] board, ch;
    static int m, n,count;
    static Queue<Point> q = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void BFS() {
        count =0;
        while(!q.isEmpty()){
            int L = q.size();

            for (int j = 0; j < L; j++) {
            Point tmp = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    if (0 <= nx && nx < n && 0 <= ny && ny < m && board[nx][ny] == 0 && ch[nx][ny] == 0) {
                        q.add(new Point(nx, ny));
                        board[nx][ny] = 1;
                        ch[nx][ny] = 1;
                    }
                }
            }
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        ch= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tmp  = sc.nextInt();
                board[i][j] = tmp;
                if(tmp == 1){
                    q.add(new Point(i, j));
                    ch[i][j] = 1;
                }
            }
        }

        BFS();
        for (int[] arr : board) {
            for (int x : arr) {
                if(x==0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(count-1);



    }



    static class Point{
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
