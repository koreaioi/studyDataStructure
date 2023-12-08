package Algorythm_String;

import java.util.Arrays;
import java.util.Scanner;

public class String10_solution {
    public static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < answer.length; i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                answer[i] = ++p;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                ++p;
                answer[i] = Math.min(answer[i], p);
            }
        }


        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);

        int[] answer = solution(str, t);
        for (int x : answer) {
            System.out.println(x + " ");
        }
    }
}
