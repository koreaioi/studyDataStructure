package BFS_DFS;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class ac2667 {

    static int n;
    static int[][] arr;
    static boolean[][] ch;
    static Queue<Point> q = new LinkedList<Point>();
    static StringBuilder sb = new StringBuilder();
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static ArrayList<Integer> al = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        ch = new boolean[n+1][n+1];

        // 값 초기화
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            for(int j = 1; j <= str.length(); j++) {
                arr[i][j] = str.charAt(j-1) -'0';
            }
        }

        // 배열 출력 확인

//        for (int[] ar : arr) {
//            for (int x : ar) {
//                System.out.print(x);
//            }
//            System.out.println();
//        }

        int total =0;

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if (arr[i][j] == 1 && !ch[i][j]) {
                    total++;
                    BFS(i, j);
                }
            }
        }
        sb.append(total).append("\n");

        // 각 단지내 집의 수 오름차순 조건이 있음
        Collections.sort(al);
        for (int x : al) {
            sb.append(x).append("\n");
        }

        System.out.println(sb);
    }

    public static void BFS(int x, int y){
        int count =0;
        q.offer(new Point(x, y));
        count++;

        while (!q.isEmpty()) {
            Point tmp = q.poll();
            ch[x][y] = true;

            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (0 < nx && nx <= n && 0 < ny && ny <= n && !ch[nx][ny] && arr[nx][ny] == 1) {
                    q.offer(new Point(nx,ny));
                    ch[nx][ny] = true;

                    count++;
                }
            }
        }
        al.add(count);
    }

    static class Point{
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}
