package Stack_Queue;

import java.util.*;

public class stack_04_solution {
    public static int solution(String str) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)) st.push(x - 48);
            else{
                int n1 = st.pop();
                int n2 = st.pop();
                if(x =='*') st.push(n2 * n1);
                else if(x =='/') st.push(n2 / n1);
                else if(x =='+') st.push(n2 + n1);
                else if(x =='-') st.push(n2 - n1);
            }
        }
        answer = st.pop();

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
