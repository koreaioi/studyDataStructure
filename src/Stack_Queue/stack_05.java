package Stack_Queue;

import java.util.*;

public class stack_05 {
    public static int solution(String str) {
        int answer = 0;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if(tmp=='(') st.push(tmp);
            else{
                if(str.charAt(i-1) == '('){
                    st.pop();
                    answer += st.size();
                }else{
                    st.pop();
                    answer += 1;
                }
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
