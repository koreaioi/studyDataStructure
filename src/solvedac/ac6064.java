package solvedac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ac6064 {
    static int t,m,n,x,y;
    static StringBuilder sb;

    public static void solution(int m, int n, int x, int y) {

        int index = 0;
        int answer;
        while (true) {
            if ((m * index + x) % n == y) {
                answer = m * index + x;
                break;
            }
            if (m + index + x > m*n) {
                answer = -1;
                break;
            }
            index++;
        }
        System.out.println(answer);


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
             solution(m, n, x, y);
        }

        System.out.println(sb);

    }
}
