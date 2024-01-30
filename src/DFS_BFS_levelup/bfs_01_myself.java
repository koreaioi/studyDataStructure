package DFS_BFS_levelup;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs_01_myself {
    public static int[][] board = new int[8][8];
    public static Queue<Point> q = new LinkedList<>();
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int L=0;

    public static void BFS() {

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Point tmp = q.poll();
                if(tmp!=null &&tmp.x==7 && tmp.y ==7) {
                    System.out.println(L);
                    System.exit(0);
                }
                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j];
                    int ny = tmp.y + dy[j];
                    if (1 <= nx && nx <= 7 && 1 <= ny && ny <= 7 && board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        q.add(new Point(nx, ny));
                    }
                }
            }
            L++;
        }
        System.out.println(-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) board[i][j] = sc.nextInt();
        }
        q.add(new Point(1, 1));
        board[1][1] = 1;

        BFS();
/*      //test
        for (int[] arr : board) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
*/

    }

    static class Point{
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
