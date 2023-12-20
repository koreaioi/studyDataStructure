package solvedac;

import java.util.Arrays;
import java.util.Scanner;

public class ac4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        StringBuilder sb = new StringBuilder();
        while (true) {
            for (int i = 0; i < 3; i++) arr[i] = sc.nextInt();
            if(arr[0]*arr[1]*arr[2]==0) break;
            Arrays.sort(arr);
            if (arr[2]*arr[2] == arr[1] * arr[1] + arr[0]*arr[0]) sb.append("right\n");
            else sb.append("wrong\n");
        }
        System.out.println(sb);
    }

}
