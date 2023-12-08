package Algorythm_Array;

import java.util.Scanner;
import java.lang.Math;
public class Array06 {
    public static void solution(int[] intArr, int n) {
        for (int i = 0; i < n; i++) {
            char[] tmp = String.valueOf(intArr[i]).toCharArray();
            //System.out.println(tmp);
            for (int j = 0; j < tmp.length / 2; j++) {
                char tmp1 = tmp[j];
                tmp[j] = tmp[tmp.length - j - 1];
                tmp[tmp.length -j -1] = tmp1;
            }

            int tmpInt = Integer.parseInt(String.valueOf(tmp));
            boolean flag = true;
            if (tmpInt < 2) {
                continue;
            }else if(tmpInt ==2){
                System.out.print(tmpInt + " ");
            } else if (tmpInt > 2) {
                for(int j =2; j<= Math.sqrt(tmpInt);j++){
                    if(tmpInt % j == 0){
                        flag = false;
                        break;
                    }
                    flag = true;
                }
                if(flag == true)System.out.print(tmpInt + " ");
            }
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        solution(intArr, n);


    }
}
