package solvedac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ac2630 {
    public static int[][] board;
    public static int n, white, black;
    /*white = 0, black = 1
     * 2 1
     * 3 4
     */


    public static void divide(int y, int x, int size) {
        //row 가로, col 세로
        if (colorCheck(y, x, size)) { //단색만 있는경우
            if(board[y][x] == 0) white++;
            else black++;

            return;
        } //색이 혼합된 경우 4분할 해야함

        int newsize = size / 2;
        //재귀 호출
        divide(y, x, newsize); //2사분면
        divide(y, x + newsize, newsize); //1사분면
        divide(y + newsize, x, newsize); //3사분면
        divide(y + newsize, x + newsize, newsize);
    }

    public static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if(board[row][col] != color) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) board[i][j] = Integer.parseInt(st.nextToken());
        }

/*        for (int[] arr : board) {
            for(int x : arr) System.out.print(x + " ");
            System.out.println();
        }*/
        white = 0;
        black =0;
        divide(0, 0, n);

        System.out.println(white + "\n" + black);

    }
}
