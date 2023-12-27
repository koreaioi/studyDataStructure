package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ac1003_fail {
    static int count_0=0;
    static int count_1=1;

    public static int fivo(int n) {
        if(n ==0){
            count_0++;
            return 0;
        } else if (n==1) {
            count_1++;
            return 1;
        }else{
            return fivo(n - 1) + fivo(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            count_0 = 0;
            count_1 = 0;
            fivo(Integer.parseInt(br.readLine()));
            sb.append(count_0).append(" ").append(count_1).append("\n");
        }
        System.out.println(sb);
    }
}
