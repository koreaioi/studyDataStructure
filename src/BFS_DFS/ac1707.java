package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ac1707 {

    static int n,m, v, count;
    static boolean[][] arr;
    static boolean[] ch;
    static StringBuilder sb;
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        // 헷갈리지 않게 배열 + 1
        arr = new boolean[n + 1][n + 1];
        ch = new boolean[n + 1];
        int x,y;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[x][y] = true;
            arr[y][x] = true;
        }
        // 값 세팅 종료

        DFS(v);

        sb.append("\n");
        ch = new boolean[n + 1];
        q.offer(v);
        ch[v]=true;
        BFS();

    }

    public static void DFS(int x) {
        ch[x] = true;
        sb.append(x).append(" ");

        for (int i = 1; i <= n; i++) {
            if(arr[x][i] && !ch[i]){
                DFS(i);
            }
        }

    }

    public static void BFS() {

        while (!q.isEmpty()) {
            int num = q.poll();
            sb.append(num).append(" ");
            for (int i = 1; i <= n; i++) {
                if(arr[num][i] && !ch[i]){
                    ch[i] = true;
                    q.offer(i);
                }

            }
        }
        System.out.println(sb);
    }
}
