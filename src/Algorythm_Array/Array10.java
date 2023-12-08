package Algorythm_Array;

import java.util.Scanner;

public class Array10 {
    public static int solution(int[][] intArr, int n) {
        int count =0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if( (intArr[i][j]  > intArr[i-1][j]) && (intArr[i][j]  > intArr[i +1][j]) &&
                        (intArr[i][j]  > intArr[i][j-1]) && (intArr[i][j]  > intArr[i][j+1])) count++;
            }
        }


        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intArr = new int[n + 2][n + 2];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                intArr[i][j] = sc.nextInt();
            }
        }

        /*for (int i = 1; i < n+1 ; i++) {
            for (int j = 1; j < n+1; j++) {
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println(solution(intArr , n));
    }
}
