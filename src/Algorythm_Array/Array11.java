package Algorythm_Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array11 {
    public static int solution(int[][] intArr, int n) {
        int answer =0;
        int count =0;
        Set<Integer> set = new HashSet<>();


        //k, k번학생을 의미한다.
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < 5; i++) {
                int tmp2 = intArr[k][i];
                String tmp1 = "";
                for (int j = 0; j < n; j++) {
                    if( tmp2 == intArr[j][i]){
                        if(k == j) continue;
                        //System.out.println(i + ", " + j);
                        set.add(j);
                    }
                }
            }
            if(count < set.size()){
                count = set.size();
                answer = k + 1;
            }
            set.clear();


        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intArr = new int[n][5];

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                intArr[i][j] = sc.nextInt();
            }
        }

       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println();
        }*/

        System.out.println(solution(intArr , n));

    }
}
