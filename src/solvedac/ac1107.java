package solvedac;

import java.util.ArrayList;
import java.util.Scanner;

public class ac1107 {
    static ArrayList<Integer> AL = new ArrayList<>();

    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(AL.contains(s.charAt(i)-'0')) return false;
        }
        return true;
    }

    /*
    * (int)s.charAt(i)를 하면 i의 아스키코드 번호가 나온다.
    * 0이면 48, 1이면 49...
    * 그래서 i - '0'을 하면 1, 2, 3이 나온다
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(str);
        int m = sc.nextInt();
        int answer=Math.abs(100 - n); // +, - 로만 움직일 때
        int count=0;

        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            AL.add(tmp);
        }

        for (int i = 0; i < 999999; i++) {
            String s = String.valueOf(i);
            if(!check(s)) continue;
            count = s.length() + Math.abs(i - n);
            answer = Math.min(answer, count);
        }
        System.out.println(answer);
    }
}