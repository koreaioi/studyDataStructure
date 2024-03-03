package solvedac;
import java.util.*;

public class ac7576 {
    static int[][] board, ch;
    static int m, n;
    static Queue<Point> q = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void BFS() {


        while(!q.isEmpty()){

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





/*
        //test
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

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
