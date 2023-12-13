package solvedac;
import java.util.*;

public class ac2231 {
    public static int findSumNum(int n, int digit) {
        int tmp = n - digit * 9;

        for (int i = tmp; i < n; i++) {
            int t = i;
            int sum = i;
            while (t > 0) {
                sum += t % 10;
                t = t / 10;
            }
            if(sum == n) return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 10) {
            if(n % 2 == 0) System.out.println(n / 2);
            else System.out.println(0);
        }
        else if(n < 100) System.out.println(findSumNum(n,2));
        else if(n < 1000) System.out.println(findSumNum(n, 3));
        else if (n < 10000) System.out.println(findSumNum(n, 4));
        else if (n < 100000) System.out.println(findSumNum(n, 5));
        else if (n < 1000000) System.out.println(findSumNum(n, 6));
        else if (n == 1000000) System.out.println(findSumNum(n, 7));

        //n이 10미만이면 그냥 n



    }

}
