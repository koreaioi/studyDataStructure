package DFS_BFS_levelup;
import java.util.*;

public class dfs_05_myself {
    public static int n; //동전 종류의 개수
    public static int m; //거슬러 줄 금액
    public static int line; // (m/max) + (m%max)
    public static int min_count=Integer.MAX_VALUE;

    /*
    * 만약 동전 종류가 1 2 6 이고
    * 거슬러줄 금액이 20이면
    * 가장 큰 수 6
    * */

    public static void BFS(Integer[] arr) {
        Queue<Node1> q = new LinkedList<>();
        q.add(new Node1(0,0));

        while (!q.isEmpty()) {
            Node1 tmp = q.poll();
            int SUM = tmp.sum;
            int COUNT = tmp.count;
            if (COUNT > line || SUM >m) continue;
            else if(SUM == m) {
                System.out.println(tmp.count);
                System.exit(0);
            }else{
                for (int i = 0; i < n; i++) {
                    q.offer(new Node1(SUM + arr[i], COUNT + 1));
                }
            }
        }
    }

/*    public static void DFS(int sum, int count, Integer[] arr) {
        if (sum > m || count > min_count) return;
        if( sum == m){
            min_count = Math.min(min_count, count);
        }else{
            for (int i = 0; i < n; i++) {
                DFS(sum + arr[i], count+1, arr);
            }
        }

    }*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        int max = arr[0];
        int min = arr[arr.length - 1];
        m = sc.nextInt();
        line = (m / max) + (m % max);

        BFS(arr);
        /*DFS(0, 0, arr);*/
        System.out.println(min_count);

    }
}

class Node1{
    int sum;
    int count;

    Node1(int sum, int count) {
        this.sum = sum;
        this.count = count;
    }
}
