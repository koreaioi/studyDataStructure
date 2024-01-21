package DFS_BFS_levelup;

import java.util.Scanner;

public class dfs_04_myself {
    public static int n;
    public static int m; //m단계 까지만
    public static String answer = "";

    //L은 단계 (m까지)
    public static void DFS(int L) {
        if(L == m){
            System.out.println(answer);
        }else{
            for (int i = 1; i <= n; i++) {
                String tmp = answer;
                answer = answer + i + " ";
                DFS(L + 1);
                answer = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();


        DFS(0);



    }
}
