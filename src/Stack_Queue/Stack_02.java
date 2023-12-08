package Stack_Queue;

import java.util.*;

public class Stack_02  {
    public static String solution(String str) {
        String answer = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') count++;
            else if(str.charAt(i) == ')') count--;
            else{
                if(count==0) answer += str.charAt(i);
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
