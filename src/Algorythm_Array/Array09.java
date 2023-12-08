package Algorythm_Array;

import java.util.Scanner;

public class Array09 {
    public static int solution(int[][] intArr, int n) {
        int max=0;
        int tmp=0;
        for (int i = 0; i < n; i++) {
            //행의 합
            tmp=0;
            for (int j = 0; j < n; j++) {
                tmp += intArr[i][j];
            }
            if(tmp > max) max = tmp;

            //열의 합
            tmp=0;
            for (int j = 0; j < n; j++) {
                tmp += intArr[j][i];
            }
            if(tmp > max) max = tmp;
        }
        //대각선의 합
        tmp=0; int tmp1=0;
        for (int i = 0; i < n; i++) {
            tmp += intArr[i][i];
            tmp1 += intArr[i][n - i - 1];
        }
        //tmp와 tmp1 중 큰걸 tmp에 두고 tmp를 max와 비교
        if(tmp < tmp1)tmp = tmp1;
        if(tmp > max) max = tmp;

        /*tmp=0;
        for (int i = 0; i < n; i++) {
            tmp += intArr[i][n-i-1];
        }
        if(tmp > max) max = tmp;
*/
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                intArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(intArr, n));

    }
}
