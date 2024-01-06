package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ac1389_bf {
    static int[][] arr; //간선 표현
    static int[] kevin; //케빈 베이컨의 수
    static int count= 0;
    static boolean[] ch;
    static int n;
    static int m;

    static Queue<Integer> q = new LinkedList<>();

    public static void BFS(int start) {
        ch = new boolean[n + 1];
        count=0;

        ch[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            count++;
            int len = q.size();

            for (int j = 0; j < len; j++) {
                int tmp = q.poll();

                for (int i = 1; i <= n; i++) {
                    if(arr[tmp][i] == 1 && !ch[i]){
                        q.add(i);
                        ch[i] = true;
                        kevin[start] += count;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        kevin = new int[n + 1];

        //간선 초기화
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        for (int i = 1; i <= n; i++) BFS(i);

        int min = 5001;
        int index=0;
        for (int i = 1; i <= n; i++) { //케빈 베이컨의 수가 최소인 사람 구하기
            if(kevin[i] < min){
                min = kevin[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
