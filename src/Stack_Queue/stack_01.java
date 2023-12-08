package Stack_Queue;

import java.util.Scanner;

public class stack_01 {
    public static String solution(String str) {
        String answer = "NO";
        int count =0; //여는 괄호의 개수.

        for (char x : str.toCharArray()) {
            if(x =='(') count++;
            if(x ==')'){
                if(count ==0) return "NO";
                else count--;
            }
        }

        if(count == 0) return "YES";
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));


    }
}
