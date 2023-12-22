package solvedac;

import java.util.Scanner;
import java.util.Stack;

public class ac4949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> st = new Stack<>();
            String str = sc.nextLine();
            boolean flag = true; //이중으로 sb.append 되는걸 방지
            if(str.equals(".") ) break;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == '(' || c=='[') st.push(c);
                else if(c == ')'){
                    if(st.isEmpty()) { //비어있으면 비정상
                        sb.append("no\n");
                        flag = false;
                        break;
                    } else { //st이 안비어있으면
                        char tp = st.peek();
                        if(tp == '(') st.pop();
                        else {
                            sb.append("no\n");
                            flag = false;
                            break;
                        }
                    }
                } else if(c == ']'){
                    if(st.isEmpty()) { //비어있으면 비정상
                        sb.append("no\n");
                        flag = false;
                        break;
                    } else { //st이 안비어있으면
                        char tp = st.peek();
                        if(tp == '[') st.pop();
                        else {
                            sb.append("no\n");
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(flag){
                if(!st.isEmpty()) sb.append("no\n");
                else sb.append("yes\n");
            }
            //검증 끝나서 스택이 비어있으면 yes 아니면 no



        }
        System.out.println(sb);



    }

}

