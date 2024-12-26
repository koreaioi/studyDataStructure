package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class review03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        String maxString = "";

        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            if(str.length() > max) {
                max = str.length();
                maxString = str;
            }
        }
        System.out.println(maxString);
    }
}
