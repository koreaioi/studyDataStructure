/*
package Stack_Queue;

import java.util.*;

public class Queue_03 {


    public static int solution(Queue<Person> q, int m) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < q.size(); i++) {
        //현재 큐의 최댓값을 알아내자
            for (int j = 0; j < q.size()-i; j++) {
                int tmp = q.peek().num;
                if (tmp > max) max = tmp;
                q.add(q.poll());
            }

            for (int j = 0; j < q.size(); j++) {
                Person tmp = q.peek();
                if (tmp.num == max) {
                    if(tmp.order == m) return ++answer;
                    q.remove();
                    answer++;
                    break;
                } else q.add(q.poll());
            }
            max = 0;
        }



*/
/*
        for (Person p : q) {
            System.out.print("[" + p.num + ", " + p.order+ "]");
        }*//*



        return answer;
    }

    public static void main(String[] args) {

        Person[] p = new Person[n];
        Queue<Person> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            p[i] = new Person(num, i);
            q.add(p[i]);
        }

        System.out.println(solution(q, m));



    }
}
*/
