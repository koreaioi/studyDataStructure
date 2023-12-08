package TwoPoint_SlideingWindow;

import java.util.Scanner;

public class _03Slidingwindow {

    public static int solution(int[] arr, int n, int k) {
        int answer = 0;
        for (int i = 0; i < k; i++) {
            answer += arr[i];
        }
        int max = answer;

        for (int i = k; i < n -1 ; i++) {
            answer = answer + arr[i] - arr[i-k] ;
            if(answer > max) max = answer;
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

//시간 초과로 실패한 예
 /*   public static int k_cal(int[] arr, int k, int index) {
        int sum = 0;
        for (int i = index; i < index + k; i++) {
            sum += arr[i];
        }

        return sum;
    }*/


/* public static int solution(int[] arr, int n, int k) {
        int max = 0;
        for (int i = 0; i < n - k + 1; i++) {
            if(k_cal(arr, k, i) > max) max = k_cal(arr, k, i);
        }
        return max;
    }*/