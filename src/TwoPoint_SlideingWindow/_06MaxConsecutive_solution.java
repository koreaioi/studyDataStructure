package TwoPoint_SlideingWindow;

import java.util.Scanner;

public class _06MaxConsecutive_solution {
    public static int solution(int[] arr, int n, int k) {
        int answer = 0, count = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if(arr[rt]==0) count++;
            while (count > k) {
                if(arr[lt]==0) count--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, n, k));

    }
}
