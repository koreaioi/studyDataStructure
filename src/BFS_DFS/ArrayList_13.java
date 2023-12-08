package BFS_DFS;
import java.util.*;


public class ArrayList_13 {
    public static int[] ch;
    public static ArrayList<ArrayList<Integer>> graph;
    public static int n,m,count =0;

    public static void DFS(int num) {
        /*ArrayList<Integer> tmp = graph.get(num);
        for (int x : tmp) {
            if(x==5) count++;
            if(ch[x] == 0){
                ch[x] = 1;
                DFS(x);
                ch[x] = 0;
            }
        }
*/
        if(num == 5) count++;
        else{
             ArrayList<Integer> tmp = graph.get(num);
            for (int x : tmp) {
            if(ch[x] ==0){ //정점 x 를 방문하지 않았으면
                ch[x] = 1;
                DFS(x);
                ch[x]=0;
            }

            }
        }

    }

 /*   public static void DFS(ArrayList<Integer> gp) {
        for (int x : gp) {
            if(x == 5) count++;
            if (ch[x] == 0) {
                ch[x] = 1;
                DFS(graph.get(x));
                ch[x] = 0;
            }
        }
    }*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점의 수
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++) { //graph를 0~n까지 AL를 만들어야함
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        //ArrayList에 연결해야함

        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            graph.get(v).add(e);
        }
        /*for (ArrayList<Integer> a : graph) {
            for (int x : a) {
                System.out.print(x + ' ');
            }
            System.out.println();
        }*/

        ch[1] = 1;
        DFS(1);
        System.out.println(count);
    }

}
