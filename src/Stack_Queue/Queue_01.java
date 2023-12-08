package Stack_Queue;

import java.util.*;

public class Queue_01 {
    public static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int count = 1;

        for (int i = 1; i <= n; i++) q.add(i);

        for (int i = 1; i < n *k; i++) {
            if(count ==k) {
                q.remove();
                count=1;
            }else{
                q.add(q.remove());
                count++;
            }
        }
        answer = q.peek();

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution(n, k));

    }
}
