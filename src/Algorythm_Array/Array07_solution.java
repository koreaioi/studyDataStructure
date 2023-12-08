package Algorythm_Array;

import java.util.Scanner;

public class Array07_solution {
    public static int solution(int[] intArr, int n) {
        int sum =0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if (intArr[i] == 1) {
                count++;
                sum+=count;
            }else{
                count=0;
            }
        }
        return sum;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        System.out.println(solution(intArr, n));


    }
}
