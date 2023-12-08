package Stack_Queue;

import java.util.*;
public class Queue_02_Queue_solution{
    public static String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < need.length(); i++) q.add(need.charAt(i));

        for (char x : plan.toCharArray()) if (q.contains(x) && x!=q.poll())return "NO";

        if(!q.isEmpty()) return "NO";
        //반복문이 끝났는데 q에 값이 있는경우 즉, 필수 과목을 덜 수강한 경우이다.

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String need = sc.next();
        String plan = sc.next();

        System.out.println(solution(need, plan));

    }
}
