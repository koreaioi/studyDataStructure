package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class pratice {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[K];
        sc.nextLine();
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);
        int start = 1;
        int end = arr[K - 1];
        int mid;
        int answer = 0;
        while (start <= end) {
            long total = 0;
            mid = (start + end) / 2;
            for (int num : arr) {
                total += num / mid;
            }
            if (total < N) {
                end = mid - 1;
            } else {
                answer = mid;
                start = mid + 1;
            }
        }
        System.out.println(answer);
    }
}
