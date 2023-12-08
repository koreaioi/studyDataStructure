package Sort;
import java.util.*;

public class Sort_08 {
    public static int solution(int n, int m, int[] arr) {
        int count=1;

        for (int i = 0; i < n; i++) if(arr[i] < m) count++;


        return count; //자기 자신
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(solution(n,m,arr));
    }
}
