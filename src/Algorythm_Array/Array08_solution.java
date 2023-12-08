package Algorythm_Array;

import java.util.Scanner;

public class Array08_solution {
    public static int[] solution(int[] intArr, int n) {
        int[] answer = new int[n];


        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                //intArr[i] 보다 큰 수가 있으면 count++한다. (1등에서 2등 처리)
                if(intArr[i] < intArr[j])   count++;
            }
            answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        for (int x : solution(intArr, n)) {
            System.out.print(x + " ");
        }

    }
}
