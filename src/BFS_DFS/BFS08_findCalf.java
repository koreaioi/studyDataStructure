package BFS_DFS;
import java.util.*;



public class BFS08_findCalf {
    static int answer;

    public static void BFS(int num) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(num);
        int L =0; //계층
        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
            int tmp = Q.poll();

                if(tmp == answer) {
                    System.out.println(L);
                    return;
                }
                else {
                   if(answer - tmp >= 5){
                       Q.offer(tmp + 5);
                   }else{
                 Q.offer(tmp + 1);
                 Q.offer(tmp - 1);

                   }

                }
            }
            L++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        answer = E - S; //0에서 부터 찾아야할 답

        BFS(0);

    }



}
