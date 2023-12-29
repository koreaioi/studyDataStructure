package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ac1012 {
    static int[][] arr;
    static int count=0;
    public static class Point{
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void DFS(int[][] arr, int x, int y) {
        if(arr[x][y] == 1){
            arr[x][y] = 0;
            DFS(arr, x - 1, y);
            DFS(arr, x + 1, y);
            DFS(arr, x, y-1);
            DFS(arr, x, y+1);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int z = 0; z < t; z++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Point> q = new LinkedList<>();
            int m = Integer.parseInt(st.nextToken()); //가로
            int n = Integer.parseInt(st.nextToken()); //세로
            int k = Integer.parseInt(st.nextToken()); //배추 개수
            arr = new int[m+2][n+2];
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()) + 1;
                int y = Integer.parseInt(st.nextToken()) + 1;
                arr[x][y] = 1;
                q.add(new Point(x, y));
            }

            while(!q.isEmpty()){
                Point tmp = q.poll();
                if (arr[tmp.x][tmp.y] != 0) {
                    count++;
                    DFS(arr, tmp.x , tmp.y);
                }
            }

            sb.append(count).append("\n");
            count =0;
        }
        System.out.println(sb);

        /*for (Point p : q) System.out.println(p.x + " " + p.y);*/

       /* for (int[] arrr : arr) {
            for (int x : arrr) {
                System.out.print(x +" ");
            }
            System.out.println();
        }*/

    }
}
