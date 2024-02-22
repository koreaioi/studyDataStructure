package solvedac;

import java.util.*;

public class ac5430 {
    public static int[] arr;

    public static String reduceCommand(String p) { //RR 두번이면 그대로니 명령어를 줄이는 메서드
        Stack<Character> st = new Stack<>();
        String tmp = "";
        for(char c : p.toCharArray()){
            if(st.isEmpty()) st.push(c);
            else{
                if(st.peek()=='R' && c=='R') st.pop();
                else st.push(c);
            }
        }
        while (!st.isEmpty()) tmp = st.pop() + tmp;
        return tmp;
    }

    public static String printDeque(Deque<Integer> dq, boolean isRight) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if(!dq.isEmpty()){ //dq가 비어있으면 그냥 sb는 []가됨.
            if(isRight){
                sb.append(dq.pollFirst());
                while (!dq.isEmpty()) sb.append(',').append(dq.poll());
            }else{
                sb.append(dq.pollLast());
                while(!dq.isEmpty()) sb.append(',').append(dq.pollLast());
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            String command = sc.next(); //명령어
            int n = sc.nextInt(); //배열 크기
            String tmp = sc.next(); //정수
            boolean flag = true; //중간에 오류가 나면 false로 하고 sb에 error 추가
            StringTokenizer st = new StringTokenizer(tmp, "[],");
            for (int i = 0; i < n; i++) dq.add(Integer.parseInt(st.nextToken()));

            boolean isRight=true; // 뒤집어졌으면 false
            for (int i = 0; i < command.length(); i++) {

                char c = command.charAt(i);
                if(dq.isEmpty() && c=='D') {
                    flag = false;
                    break;
                }
                if (c == 'R') {
                    isRight = !isRight;
                }else{ //'D'인 경우
                    if(isRight) dq.pollFirst();
                    else dq.pollLast();
                }
            }

            if(flag) sb.append(printDeque(dq, isRight)).append("\n");
            else sb.append("error\n");
        }
        System.out.println(sb);
    }
}
