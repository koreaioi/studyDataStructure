package DFS_BFS_levelup;
import java.util.*;

//DFS 활용 2번 - 바둑이 승차를 BFS로 풀어보기
public class pratice_02 {
    public static int w; //무게
    public static int n; //바둑이 수
    public static int[] arr; //바둑이
    public static int max =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i ++) arr[i] = sc.nextInt();

        BFS();

        System.out.println(max);
    }

    public static void BFS() {
        Queue<Node> q = new LinkedList<Node>();
        q.add(new Node(0, 0));

        while (!q.isEmpty()) {
            Node tmp = q.poll();
            int L = tmp.level;

            if(tmp.sum > w) continue;
            if(tmp.level == n){
                max = Math.max(tmp.sum, max);
            }else{
                q.offer(new Node(L + 1, tmp.sum + arr[L]));
                q.offer(new Node(L + 1, tmp.sum));
            }
        }
    }
}

class Node{
    int level;
    int sum;

    Node(int level, int sum) {
        this.level = level;
        this.sum = sum;
    }
}
