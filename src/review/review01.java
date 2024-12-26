package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class review01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        st = new StringTokenizer(br.readLine());
        char ans = st.nextToken().charAt(0);
        int count = 0;
        ans = Character.toLowerCase(ans);

        for (char c : str.toLowerCase().toCharArray()) {
            if (c == ans) {
                count++;
            }
        }
        System.out.println(count);
    }
}
