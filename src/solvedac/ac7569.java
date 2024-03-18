package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ac7569 {

    static int[] dx = {0,0,0,0,1,-1};
    static int[] dy = {0,0,1,-1,0,0};
    static int[] dz= {1,-1,0,0,0,0};
    static int[][][] board;
    static int[][][] ch;
    static int x,y, z,count;
    static Queue<Point> q = new LinkedList<>();

    public static void BFS() {
        count = 0;

        while (!q.isEmpty()) {
            int L = q.size();

            for (int i = 0; i < L; i++) {
                Point tmp = q.poll();
                for (int j = 0; j < 6; j++) {
                    int nz = tmp.z + dz[j];
                    int ny = tmp.y + dy[j];
                    int nx = tmp.x + dx[j];
                    if (0 <= nx && nx < x && 0 <= ny && ny < y && 0 <= nz && nz < z //배열 index 조건
                            && board[nz][ny][nx] == 0 && ch[nz][ny][nx] == 0) {
                        //board[][][]==0 -> 아직 토마토가 자라지 않고
                        //ch[][][] ==0 방문하지 않았다면
                        q.add(new Point(nz, ny, nx));
                        ch[nz][ny][nx] = 1;
                        board[nz][ny][nx] = 1;
                    }
                }
            } //회차 종료

            count++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        z = Integer.parseInt(st.nextToken());
        board = new int[z][x][y];
        ch = new int[z][x][y];
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < x; k++) {
                    int tmp = Integer.parseInt(st.nextToken());
                    board[i][j][k] = tmp;
                    if (tmp == 1) {
                        q.add(new Point(i, j, k));
                        ch[i][j][k] = 1;
                    }
                }
            }
        }
        for (int[][] arr : board) {
            for (int[] ar : arr) {
                for (int x : ar) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


        System.out.println(q.size());
        BFS();
        System.out.println(count);


        //Test_Print
        for (int[][] arr : board) {
            for (int[] ar : arr) {
                for (int x : ar) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


        for (Point p : q) {
            System.out.println(p.z + " " + p.y + " " + p.x);
        }

    } //main 종료
    static class Point{
        int x,y, z;

        public Point(int z, int x, int y) {
            this.z = z;
            this.y = y;
            this.x = x;
        }
    }
}
