package Algorythm_Array;

import java.util.*;

public class Array09_solution {
    public static int solution(int[][] arr, int n) {
        int max = Integer.MIN_VALUE; //최댓값을 구하므로 max를 가장 작은 값으로 초기화
        int sum1 ,sum2;
        //행과 열의 합
        for (int i = 0; i < n; i++) {
            sum1=sum2=0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j]; //행의 합
                sum2 += arr[j][i]; //열의 합
            }
            //최댓값 갱신
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        //두 대각선의 합
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[n - i - 1][i];
        }
        //최댓값 갱신
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    }
}
