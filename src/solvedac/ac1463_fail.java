package solvedac;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ac1463_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        Queue<Integer> q = new LinkedList<>();
        q.add(n);

        while (!q.contains(1)) {
            int len = q.size();

            for(int i =0;i<len;i++){
            int tmp = q.poll();
                if(tmp % 3 ==0) q.offer(tmp / 3);
                else if ((tmp-1)%3==0 && tmp%2==0) {
                    q.offer(tmp - 1);
                    q.offer(tmp / 2);
                }else if(tmp%2==0) q.add(tmp / 2);
                else q.offer(tmp - 1);
            }

          /*  for (int x : q) {
              System.out.print(x + " ");
            }
           System.out.println();
*/
            count++;
        }



        System.out.println(count);
    }
}
