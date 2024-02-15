package solvedac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ac2606 {
    public static int n,m,count; //컴퓨터 수
    public static int[][] computers;
    public static int[] ch;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        computers = new int[n + 1][n + 1];
        ch = new int[n + 1];
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            computers[n1][n2] = 1;
            computers[n2][n1] = 1;
        }
        count = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        ch[1] = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int tmp = q.poll();
                for (int j = 1; j <= n ; j++) {
                    if(computers[tmp][j] == 1 && ch[j] ==0){
                        q.add(j);
                        ch[j] =1;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
