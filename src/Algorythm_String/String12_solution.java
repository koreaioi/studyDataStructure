package Algorythm_String;

import java.util.Scanner;

public class String12_solution  {
    public static String solution(String str, int num) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int n = Integer.parseInt(tmp, 2);
            answer += (char) n;
            str = str.substring(7);
            // 인덱스 7부터 마지막까지
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(str, n));
    }
}
