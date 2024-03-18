package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ac7569_myself {
    static int[][][] board;
    static int[][][] ch;
    //이동 좌표
    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static int x,y,z;
    static Queue<Point> q = new LinkedList<>();

    static void BFS(){

        while(!q.isEmpty()){
            int L = q.size();

            for (int i = 0; i < L; i++) {
                Point tmp = q.poll();
                for (int j = 0; j < 6; j++) {
                    int nz = tmp.z + dz[j];
                    int ny = tmp.y + dy[j];
                    int nx = tmp.x + dx[j];
                    if(0<=nz && nz< z && 0 <= ny && ny <y && 0<= nx && nx<x &&
                        board[nz][ny][nx]==0 &&ch[nz][ny][nx]==0){
                        ch[nz][ny][nx] = 1; //체크표시
                        board[nz][ny][nx] = board[tmp.z][tmp.y][tmp.x] + 1;
                        q.add(new Point(nz, ny, nx));
                    }
                }
            } // 전체 for문 종료
        } // while문 종료
    } //BFS 종료


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        z = Integer.parseInt(st.nextToken());

        board = new int[z][y][x];
        ch = new int[z][y][x];

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < y; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < x; k++) {
                    int tmp = Integer.parseInt(st.nextToken());
                    board[i][j][k] = tmp;
                    if(tmp == 1){
                        q.add(new Point(i, j, k));
                        ch[i][j][k] = 1;
                    }
                }
            }
        }

        BFS();
        
        int max =0;
        for (int[][] arr : board) {
            for (int[] ar : arr) {
                for (int x : ar) {
                   if(x == 0) {
                       System.out.println(-1);
                       return;
                   }
                   if(x > max) max = x;
                }
            }
        }
        System.out.println(max-1);
    }

    static class Point{
        public int x,y,z;

        Point(int z, int y, int x) {
            this.z = z;
            this.y = y;
            this.x = x;
        }
    }
}
