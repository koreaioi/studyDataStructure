package solvedac;
import java.util.*;


public class ac9095 {
    static int t,n, count;
    static int[] arr;

    static void DFS(int sum, int n) {
        if (sum == n) {
            count++;
        }
        else if(sum<n){
            for (int i = 1; i <= 3; i++) DFS(sum + i, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        t = sc.nextInt();
        arr = new int[t];

        for (int i = 0; i < t; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < t; i++){
            count=0;
            int num = arr[i];
            DFS(0, num);
            sb.append(count + "\n");
        }

        System.out.println(sb);
    }
}
