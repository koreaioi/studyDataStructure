package Stack_Queue;

import java.util.*;

public class stack_01_solution {
    public static String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if(x =='(') stack.push(x);
            else{ // x == ')';
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        //스택에 자료가 남아있으면
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {

    }
}
