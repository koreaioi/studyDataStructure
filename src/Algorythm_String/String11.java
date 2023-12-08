package Algorythm_String;

import java.util.Arrays;
import java.util.Scanner;

public class String11  {
    public static String solution(String str) {
        String answer = "";
        char[] chArr = new char[str.length() + 1];
        char[] chArr1 = str.toCharArray();
        for (int i = 0; i < chArr1.length; i++) {
            chArr[i] = chArr1[i];
        }
        int count = 1;

        for (int i = 0; i < chArr.length -1; i++) {
            if (chArr[i] == chArr[i + 1]) {
                count++;
            } else {
                answer += chArr[i];
                if(count == 1) continue;
                answer += count;
                count=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }
}
