package Algorythm_String;

import java.util.Scanner;

public class String09_solution {
    public static int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)) answer += x;
            //암묵적 형변환을 해주었다.
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}


 /*   public static int solution(String str) {
        int answer=0;

        for (char x : str.toCharArray()) {
            if(48<= x && x <= 57) answer = answer * 10 + (x - 48);
            //암묵적 형변환을 해주었다.
        }
        return answer;
    }*/