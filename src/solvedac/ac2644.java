package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ac2644 {

    static int n, x, y, m;
    static boolean[][] arr;
    static boolean[] ch;
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken()); // 시작 정점
        y = Integer.parseInt(st.nextToken()); // 최종 정점
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());

        arr = new boolean[n+1][n+1];
        ch = new boolean[n + 1];

        // 그래프 초기화
        int a, b;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[a][b] = true;
            arr[b][a] = true;
        }

        q.offer(x);

        int result = BFS();
        System.out.println(result);

    }

    public static int BFS() {

        int len;
        int L = 0;

        while (!q.isEmpty()) {
            len = q.size();
            for (int i = 0; i < len; i++) {
                int tmp = q.poll();
                ch[tmp] = true;
                for (int j = 1; j <= n; j++) {
                    if (arr[tmp][j] && !ch[j]) { // 그래프 연결 +  사용하지 않은 정점 일 때
                        q.offer(j);
                        if (j == y) return L + 1;
                    }
                }
            }
            L++;
        }

        return -1;
    }
}
