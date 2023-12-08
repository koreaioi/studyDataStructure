package BFS_DFS;
import java.util.*;





public class dfs06 {
    static int[] ch;
    static int n;

    public static void DFS(int num) {
        if (num == n + 1) {
            String tmp = "";
            for (int i = 1; i <= 3; i++) {
                if(ch[i] == 1) tmp += (i + " ");
            }
            if(tmp.length() >0) System.out.println(tmp);
            //공집합이면 tmp에 아무것도 추가되지 않아 tmp.length()가 0이므로 출력되지 않음.
        } else {
            ch[num] = 1;
            DFS(num+1);
            ch[num] = 0;
            DFS(num+1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = 3;
        ch = new int[n + 1];

        DFS(1);




    }
}
