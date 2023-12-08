package Algorythm_String;

import java.util.Scanner;

public class String07 {
    public static String solution(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() -i -1)) return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();

        System.out.println(solution(str));
    }




}


/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toLowerCase();
        char[] chArr = str1.toCharArray();

        for (int i = 0; i < chArr.length / 2; i++) {
        char tmp = chArr[i];
        chArr[i] = chArr[chArr.length - i - 1];
        chArr[chArr.length - i - 1] = tmp;
        }
        String str2 = String.valueOf(chArr);
        if(str1.equals(str2)) System.out.println("YES");
        else System.out.println("NO");
*/
