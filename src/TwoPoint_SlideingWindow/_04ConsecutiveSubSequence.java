package TwoPoint_SlideingWindow;

import java.util.Scanner;

public class _04ConsecutiveSubSequence {
    //arr은 배열, 부분수열의 합이 m 이길 원한다.
    public static int solution(int[] arr, int m) {
        int count=0;
        int lt =0;
        int sum =0;

        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            while (sum >= m) {
                if (sum == m) {
                    count++;
                    sum -= arr[lt++];
                }
                if (sum > m) sum -= arr[lt++];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, m));


    }
}


 /*   public int solution(int num, int sumResult, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        for(int rt = 0; rt < num; rt++) {
            sum += arr[rt];
            while (sum > sumResult) {
                sum -= arr[lt++];
            }
            if(sum == sumResult) {
                answer++;
            }
        }

        return answer;
    }*/