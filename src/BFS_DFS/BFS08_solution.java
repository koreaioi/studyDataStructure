package BFS_DFS;
import java.util.*;


public class BFS08_solution {
    static int answer = 0;
    static int[] dis = {-1, 1, 5};
    static int[] ch; //불필요한 방문을 줄이기 위해 해당 수를 방문했는지 확인하는 check배열
    static Queue<Integer> Q = new LinkedList<>();

    public static int BFS(int s, int e) {
        ch = new int[10001]; //값은 1~ 10000까지므로
        ch[s] = 1; // 맨처음 들어오는 현수의 위치 체크 표시
        Q.offer(s);
        int L=0;
        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if(nx == e) return L + 1;
                    if (nx > 1 && nx < 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;

        }


        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();


        System.out.println(BFS(s, e));
    }
}
