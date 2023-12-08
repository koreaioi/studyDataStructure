package Algorythm_Array;

import java.util.Scanner;

public class Array12_solution {
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count =0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    //i와 j 학생의 인덱스를 찾고 반복문이 끝날 때 비교한다.
                    for (int s = 0; s < n; s++) {
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    //i와 j 의 인덱스를 비교해 i 가 더 작으면, 시험을 더 잘봤으면 count++
                    if(pi < pj) count++;
                }
                //count 와 시험 회수가 같아야한다.
                if (count == m) {
                    answer++;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, m ,arr));


    }
}
