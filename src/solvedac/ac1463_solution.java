package solvedac;
import java.util.Scanner;

public class ac1463_solution {
    public static int n;
    public static Integer[] memo;

    public static int DFS(int n) {

        if (memo[n] == null) {
            //3으로 나눠지는 경우
            if (n % 6 == 0) {
                memo[n] = Math.min(DFS(n / 3), Math.min(DFS(n / 2), DFS(n - 1)))+1;
            }else if (n % 2 == 0) {
                memo[n] = Math.min(DFS(n / 2), DFS(n - 1)) + 1;
            }
            else if (n % 3 == 0) {
                memo[n] = Math.min(DFS(n / 3), DFS(n - 1)) + 1;
            } else{
                memo[n] = DFS(n - 1) + 1;
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        memo = new Integer[n + 1];
        memo[0]=memo[1]= 0;

        System.out.println(DFS(n));
    }
}
