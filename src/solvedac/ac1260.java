package solvedac;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ac1260 {
    static int[][] arr;
    static int[] ch;
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m;
    static int v;

    static Queue<Integer> q = new LinkedList<>();

    public static void DFS(int node) {
        ch[node] = 1;
        sb.append(node + " ");
        for (int i = 1; i <= n; i++) {
            if (arr[node][i] == 1 && ch[i] == 0) {
                DFS(i);
            }
        }
    }

    public static void BFS(int node) {
        q.add(node);
        ch[node] = 1; //node는 q에 add되어 방문했음을 표시

        while (!q.isEmpty()) {
            int tmp = q.poll(); //tmp와 관련된 노드들 넓게 탐색
            sb.append(tmp + " ");

            for (int i = 1; i <= n; i++) {
                if (arr[tmp][i] == 1 && ch[i] == 0) {
                    q.add(i);
                    ch[i] = 1;
                }
            }

        }

    }

    //psvm 시작
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점의 개수
        m = sc.nextInt(); //간선의 수
        v = sc.nextInt(); //탐색을 시작하는 번호
        arr = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        DFS(v);
        ch = new int[n + 1]; //ch 배열 초기화
        sb.append("\n");
        BFS(v);


        System.out.println(sb);
    }
}
