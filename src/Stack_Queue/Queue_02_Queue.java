package Stack_Queue;

import java.util.*;
public class Queue_02_Queue {
    public static String solution(String str1, String str2) {
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str1.length(); i++) {
            q.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            if(q.peek() == str2.charAt(i)) q.remove(str2.charAt(i));
            if(q.isEmpty()) return "YES";
        }
        if(!q.isEmpty()) return "NO";

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));
    }
}
