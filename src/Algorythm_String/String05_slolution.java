package Algorythm_String;

import java.util.Scanner;

public class String05_slolution {

    public static String solution(String str){
        String answer;
        char[] chArr = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while (lt < rt){
            if(!Character.isAlphabetic(chArr[lt]))lt++;
            if(!Character.isAlphabetic(chArr[rt]))rt--;
            else {
                char tmp = chArr[lt];
                chArr[lt++] = chArr[rt];
                chArr[rt--] = tmp;
                //lt++;
                //rt--;
            }
        }

        answer = String.valueOf(chArr);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = solution(str);
        System.out.println(answer);
    }
}
