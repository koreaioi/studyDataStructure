package Algorythm_String;

import java.util.ArrayList;
import java.util.Scanner;

public class String04 {
    public static ArrayList<String> solution(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<String>();
        for (String x : strArr) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] strArr = new String[num];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.next();
        }

        for (String x : solution(num, strArr)) {
            System.out.println(x);
        }
    }
}



