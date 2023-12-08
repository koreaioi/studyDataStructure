package Algorythm_String;

import java.util.Scanner;

public class String11_solution {
    public static String solution(String str) {
        String answer = "";
        //반복문에서 i와 i+1을 비교하므로 맨 마지막 인덱스에서 오류가 발생할 수 있으므로 빈공간을 추가해줌.
        str = str + " ";

        int count=1;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1))count++;
            else{
                answer += str.charAt(i);
                if(count==1) continue;
                //answer += String.valueOf(count);
                //answer += Integer.toString(count);
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
