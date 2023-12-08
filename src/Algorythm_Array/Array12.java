package Algorythm_Array;

import java.util.Scanner;

public class Array12 {
    public static int findindexOf(int[] arr, int n) {
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n)return i;
        }
        return index;
    }

    public static int solution(int[][] intArr, int n , int m) {
        int answer = 0;
        int[][] tmp = new int[n][n];
        //학생 두 명이 만나는 경우의 수를 표현한 배열 생성 n * n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp[i][j] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    //찾는수(학생 번호)는 0~n이 아니라, 1~n+1 까지 이므로 j와 k에 +1해줘야한다.
                    if(findindexOf(intArr[i], j+1 ) > findindexOf(intArr[i], k+1)) tmp[j][k] =0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer += tmp[i][j];
            }
        }

        answer -=n;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] intArr = new int[m][n];


        //n = 4, m =3
        //n = 학생 수, m은 시험 수
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                intArr[i][j] = sc.nextInt();
            }
        }

        /*for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(intArr[i][j]);
            }
            System.out.println();
        }*/

        System.out.println(solution(intArr, n,m));

    }
}
