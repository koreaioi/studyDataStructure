package solvedac;

import java.util.*;

public class ac1697_myself {
    public static Queue<Integer> q = new LinkedList<>();
    public static int[] ch;
    public static int n,k;
    public static int[] dis = {-1, 1, 0};
    /*
    * 입력이 1 0 인 경우도 생각해서 0 <= nx로 조건을 고쳐야한다.
    * */
    public static int BFS(int n) {
        int L = 0;
        q.add(n);
        ch[n] = 1;
        while (!q.isEmpty()) {
            if(q.contains(k)) return L;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int tmp = q.poll();
                dis[2] = tmp;
                for (int j = 0; j < 3; j++) {
                    int nx = tmp + dis[j];
                    if (0 <= nx && nx < 100001 && ch[nx] == 0) {
                        q.add(nx);
                        ch[nx] = 1;
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        ch = new int[100001];

        System.out.println(BFS(n));

    }
}
