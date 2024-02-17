package GreedyAlgorithm;

import java.util.*;

public class greedy_05_sol {
    static int n,m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public static void solution(int v) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(v, 0));
        dis[v] = 0;

        while (!pq.isEmpty()) {
            Edge tmp = pq.poll(); //cost가 가장 작은 정점을 바로 꺼냄
            int now = tmp.vex;
            int nowCost = tmp.cost;
            //if(nowCost > dis[now]) continue;
            for (Edge o : graph.get(now)) {
                if (dis[o.vex] > nowCost + o.cost) {
                    dis[o.vex] = nowCost + o.cost;
                    pq.offer(new Edge(o.vex, dis[o.vex]));
                }
            }
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        solution(1);

        for (int i = 2; i <= n; i++) {
            if (dis[1] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible");
        }




    }
    static class Edge implements Comparable<Edge> {
        int vex, cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }

    }
}

/*
입력값
6 9
1 2 12
1 3 4
2 1 2
2 3 5
2 5 5
3 4 5
4 2 2
4 5 5
6 4 5
*/
