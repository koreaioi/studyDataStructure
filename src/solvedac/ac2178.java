package solvedac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ac2178 {
    public static int[][] board;
    public static int[][] ch;
    public static int n,m,L;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = { 0, 1, 0, -1};

    public static void BFS() {
        L = 1;
        Queue<Point> q = new LinkedList<>();
        ch[0][0] = 1;
        q.add(new Point(0, 0));

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Point tmp = q.poll();
                if(tmp.x ==n-1 && tmp.y == m-1) return;
                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (0 <= nx && nx < n && 0 <= ny && ny < m
                            && ch[nx][ny] == 0 && board[nx][ny]==1) {
                        q.add(new Point(nx, ny));
                        ch[nx][ny] = 1;
                    }
                }
            }
            L++;
        }



    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];
        ch = new int[n][m];

        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            for (int j = 0; j < m; j++) board[i][j] = tmp.charAt(j) - '0';
        }

/*      배열 출력
        for (int[] arr : board) {
            for(int x : arr) System.out.print(x + " ");
            System.out.println();
        }*/

        //출발지 0,0 도착지: n-1,m-1
        BFS();
        System.out.println(L);
    }

    static class Point{
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
