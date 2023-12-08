package TwoPoint_SlideingWindow;

import java.util.Scanner;

public class _06MaxConsecutive {
    public static int solution(int[] arr, int n, int k) {
        int lt =0, count=0;
        int max=0;

        for (int rt = 0; rt < n; rt ++) {
            if(arr[rt]==0) count++;
            if (count > k) max = Math.max(max, rt -lt);
            while (count > k) {
                if(arr[lt] == 1) lt++;
                if(arr[lt] == 0){
                    lt++;
                    count--;
                }
            }
        }
        return max;
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
