package Stack_Queue;

import java.util.*;

public class Queue_01_solution {
    public static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.add(i);

        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) q.add(q.poll()); //k-1번 뒤로 보내고
            q.remove(); //k번째 삭제
            if(q.size() ==1) answer = q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution(n,k));
    }
}
