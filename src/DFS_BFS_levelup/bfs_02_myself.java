package DFS_BFS_levelup;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs_02_myself {
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int n, m;
    public static int[][] board;
    public static int countOfminus =0;
    public static int L=0; //BFS 시도 횟수
    public static Queue<Point> q = new LinkedList<>();

    public static void BFS() {

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Point tmp = q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = tmp.x + dx[j]; //세로 값
                    int ny = tmp.y + dy[j]; //가로 값
                    if (0 <= nx && nx < n && 0 <= ny && ny < m && board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
            L++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); //가로
        n = sc.nextInt(); //세로
        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tmp = sc.nextInt();
                // BFS 전에 미리 토마토 있는곳 없는곳 저장.
                board[i][j] = tmp;
                if(tmp == -1) countOfminus++;
                else if(tmp ==1){
                    q.add(new Point(i, j));
                    board[i][j] = 1;
                }
            }
        }

        BFS();
        int sum=0;
        for(int[] arr:board){
            for(int x: arr) sum += x;
        }

        /*
        * 시작 전에 -1의 개수(countOfminus)를 미리 세놨다
        * 모든 토마토가 익어있는 상태는 BFS가 종료되고 배열의 모든 값에 1 or -1만 있다
        * 즉 n * m에서 2*countOfminus 값과 board 배열의 합이 일치한다면
        * 토마토를 배치할 수 없는 칸을 제외한 모든 칸에 토마토가 익은것이다.
        * */
        if(n*m-(2*countOfminus) == sum) System.out.println(L-1);
        else System.out.println(-1);



/*
        //input test
        for (int[] arr : board) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println(countOfminus);
        for(Point p : q) System.out.println(p.x + ", " + p.y);
*/

    }

    static class Point{
        int x, y;

        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }
}
