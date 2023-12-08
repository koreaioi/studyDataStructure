package Stack_Queue;

import java.util.*;

public class stack_04 {
    public static int solution(String str) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int n1, n2 = 0;

        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)) st.push(x - '0');
            else{
                n1 = st.pop();
                n2 = st.pop();
                switch (x) {
                    case '*':
                        st.push(n2 * n1);
                        break;
                    case '/':
                        st.push(n2 / n1);
                        break;
                    case '+':
                        st.push(n2 + n1);
                        break;
                    case '-':
                        st.push(n2 - n1);
                        break;
                }

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
