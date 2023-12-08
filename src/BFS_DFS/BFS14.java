package BFS_DFS;
import java.util.*;


public class BFS14 {
    public static int[] ch; //초기화 해야함
    public static int[] dis; //초기화 해야함
    public static ArrayList<ArrayList<Integer>> graph; //초기화 해야함
    public static int n = 0, m = 0, L = 0;
    public static boolean flag = true;

    public static void BFS(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);

        while (!q.isEmpty()) {
            int tmp = q.poll();
            //v: tmp, e: x
            for (int x : graph.get(tmp)) {
                if (ch[x] == 0) {
                    ch[x] = 1;
                    q.offer(x);
                    dis[x] = dis[tmp] + 1;
                }
            }
        }
    }

/*
    while (!q.isEmpty()) {
        int tmp = q.poll();
        //v: tmp, e: x
        for (int x : graph.get(tmp)) {
            if (ch[x] == 0) {
                ch[x] = 1;
                q.offer(x);
                dis[x] = dis[tmp] + 1;
            }
        }
    }

    while(!q.isEmpty()){
        int tmp = q.poll();
        flag = true;
        if(graph.get(tmp).size() == 0) flag = false;
        for (int x : graph.get(tmp)) {
            if (ch[x] == 0) {
                ch[x] = 1;
                q.offer(x);
                dis[x] = L;
            }else flag = false; //ch[x] !=0 일경우
        }
        if(flag)L++;
    }
*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점의 수
        m = sc.nextInt(); //간선의 수

        ch = new int[n + 1];
        ch[1] = 1;
        dis = new int[n + 1];
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            graph.get(v).add(e);
        }

        BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
