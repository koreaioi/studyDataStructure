package BFS_DFS;
import java.util.*;


public class dfs12 {
    static int[][] graph;
    static int count =0;
    static int[] ch; //해당 엣지로 들어갈 때 해당 엣지가 1이면 이미 사용했다는 뜻

    public static void DFS(int vertex, int n) {

        for (int edge = 2; edge <= n; edge++) {
            if(graph[vertex][edge] == 1 && ch[edge] ==0){
                if(edge==5){
                    count++;
                    return;
                }else{
                    ch[edge]=1; //이 엣지를 사용했다는 뜻
                    DFS(edge, n);
                    //DFS가 끝나서 스택프레임이 사라질 때 이 아래칸에 ch[edge]=0해주는게 포인트!!!
                    ch[edge]=0;
                }
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n + 1]; //체크배열 기본 0

        for (int i = 0; i < m; i++) {
            int tmp1 = sc.nextInt();
            int tmp2 = sc.nextInt();
            graph[tmp1][tmp2] =1;
        }

        DFS(1, n);
        System.out.println(count);


/*
        //graph 인접 행렬 확인용
        for (int[] a : graph) {
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
*/

    }
}
