package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ac1003_sol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[41];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < 41; i++) arr[i] = arr[i - 1] + arr[i -2];

        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num==0) sb.append(1 + " " + 0 + " \n");
            else sb.append(arr[num - 1]).append(" ").append(arr[num]).append(" \n");
        }
        System.out.println(sb);

    }
}
