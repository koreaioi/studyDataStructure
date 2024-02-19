package DFS_BFS_levelup;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class island_myself {
    public static int[][] board;
    public static int[] dx = {-1, 0, 1, 0, 1,1,-1,-1};
    public static int[] dy = {0, 1, 0, -1, 1,-1,-1,1 };


    public static int n , count;

    public static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));

        while (!q.isEmpty()) {
            int size = q.size();

            for (int j = 0; j < size;j++ ) {
            Point tmp = q.poll();
                for (int i = 0; i < 8; i++) {
                    int nx = tmp.x + dx[i];
                    int ny = tmp.y + dy[i];
                    if (1 <= nx && nx <= n && 1 <= ny && ny <= n && board[nx][ny] == 1) {
                        board[nx][ny] = 0;
                        q.add(new Point(nx, ny));
                    }
                }
            }



        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) board[i][j] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                if(board[i][j] == 1){
                    board[i][j] = 0;
                    BFS(i, j);
                    count++;
                }
            }
        }

        System.out.println(count);



    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
