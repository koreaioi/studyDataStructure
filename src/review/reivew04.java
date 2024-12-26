package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class reivew04 {
    static StringBuilder sb = new StringBuilder();
    static int n = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            solution(st.nextToken());
        }
        System.out.println(sb);
    }

    // 문자 뒤집기
    public static void solution(String str){
//        sb.append(new StringBuilder(str).reverse().toString()).append("\n");
        char[] c = str.toCharArray();

        for (int i = 0; i < c.length / 2; i++) {
            char tmp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = tmp;
        }
        sb.append(c).append('\n');
    }
}
