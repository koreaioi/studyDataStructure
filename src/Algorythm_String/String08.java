package Algorythm_String;

import java.util.Scanner;

public class String08 {
    public static String solution(String str) {
        String answer = "NO";
        String tmp1 = "";
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if(65 < (int)str.charAt(i) && (int)str.charAt(i) < 90 ) tmp1 += str.charAt(i);
        }
        String tmp2 = new StringBuilder(tmp1).reverse().toString();
        if(tmp2.equals(tmp1)) answer = "YES";

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));

    }
}


 /*   public static String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));

    }*/