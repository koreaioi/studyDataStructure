package Stack_Queue;

import java.util.*;

public class Queue_03_solution {
    static class Person{
        int num;
        int order;
        Person(int num, int order) {
            this.num = num;
            this.order = order;
        }
    }

    public static int solution(int n, int m, int[] arr) {
        int answer=0;
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            //num , order
            q.add(new Person(arr[i], i));
        }

        boolean flag = true; //true 이면 최대값이라는 뜻
        while(!q.isEmpty()){
            //일단 q에서 꺼낸다.
            Person tmp = q.poll();
            //일단 tmp가 최댓값이라고 가정한상태에서 true,
            //tmp가 최댓값이 아니라서 q.add(tmp)를 한다면 가정이 틀렸음을 false로 표현
            flag = true;
            //향상된 for문은 q 를 그저 전체적으로 조회만 한다. 따라서 q의 값을 변경하지않음
            for (Person p : q) {
                //큐의 수보다 작은경우가 있으면 최댓값이 아니므로 다시 넣는다.
                //tmp를 다시 null로 초기화한다. (내가 들고있는 tmp가 최대값을 가지고있지않으므로
                if(p.num > tmp.num){
                    q.add(tmp);
//                    tmp = null;
                    flag = false; //일단 최댓값이 아니므로 false;
                    break;
                }
            }
            //tmp가 최댓값이라는 가정이 맞을 경우
            if(flag == true){
                answer++; //일단 그 최댓값을 진료볼거니까 answer++하고 시작한다.
                if(tmp.order == m) return answer; //근데 그 손님이 우리가 찾던 m번째 손님이면 answer를 리턴한다.
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));

    }
}
