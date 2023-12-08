package Algorythm_String;

import java.util.Arrays;
import java.util.Scanner;
public class String10 {
    public static int[] solution(String s, char t) {
        //s는 문자열 t는 특정 문자
        int[] answer = new int[s.length()];
        int[] tlocation = new int[s.length()+1];
        int k =0;


        //s에서 t의 위치를 intarr에 저장한다.
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==t) tlocation[k++] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            answer[i] = Math.abs(i - tlocation[0]);
        }

        int i=1;
        while (tlocation[i] != 0) {
            for (int j = 0; j < s.length(); j++) {
                if (answer[j] >= Math.abs(j - tlocation[i])) {
                    answer[j] = Math.abs(j - tlocation[i]);
                }
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);

        int[] answer = solution(s, t);
        for (int x : answer) {
            System.out.print(x +" ");
        }


    }

}
