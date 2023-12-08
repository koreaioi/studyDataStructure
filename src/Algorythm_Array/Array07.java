package Algorythm_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array07 {
    public static int solution(int[] intArr, int n) {
        int tmpArr[] = new int[n];
        tmpArr[0] = intArr[0]; //처음은
        int answer = tmpArr[0];

        for (int i = 1; i < n; i++) {
            if (intArr[i] == 1) {
                if(tmpArr[i-1] >=1) tmpArr[i] = tmpArr[i - 1] + 1;
                else tmpArr[i] = 1;
            } else{
                tmpArr[i] = 0;
            }
            answer += tmpArr[i];
        }
        //System.out.println(Arrays.toString(tmpArr));
        return answer;
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
