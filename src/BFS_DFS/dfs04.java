package BFS_DFS;
import java.util.*;


public class dfs04 {
    public static  int[] fbArr;
    public static int fb(int n) {
        //int 배열의 default 값은 0 이므로 0이 아니면 그 전에 값을 구해둔 것이다.
        if(fbArr[n] != 0) return fbArr[n];

        if(n == 1) return fbArr[1] = 1;
        else if(n==2 )return fbArr[2] = 1;
        else return fbArr[n] = fb(n - 1) + fb(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //피보나치의 항과 배열의 항을 일치시키기 위해 0번째 인덱스는 사용하지 않음
        fbArr = new int[n + 1];
        fb(n);

        for (int i = 1; i <= n; i++) System.out.print(fbArr[i] + " ");
    }
}
