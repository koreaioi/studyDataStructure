package solvedac;

import java.util.Scanner;
import java.util.Stack;

public class ac9012 {
    public static boolean solution(String str) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        for (Character x : str.toCharArray()) {
            if (x == '(') st.push(x);
            else {
                if (st.isEmpty()) return false;
                else st.pop();
            }
        }
        //검증 끝났는데 아직 남아있으면
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String str = sc.next();
            if(solution(str)) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb);
    }
}
