package solvedac;

import java.util.Scanner;
import java.util.Stack;

public class ac10773 {
    public static void main(String[] args) {
        //BufferReader 사용시 더 빠름
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int answer=0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num == 0) st.pop();
            else st.push(num);
        }
        while (!st.isEmpty()) {
            answer += st.pop();
        }
        System.out.println(answer);

    }
}
