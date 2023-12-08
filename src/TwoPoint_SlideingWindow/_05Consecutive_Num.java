package TwoPoint_SlideingWindow;

import java.util.Scanner;

public class _05Consecutive_Num {
    public static int solution(int n) {
        int count =0;
        int p=1;
        int sum =0;

        for (int i = 1; i <= n / 2 + 1; i++) {
            sum += i;
            while (sum >= n) {
                if(sum == n) count++;
                sum -= p++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));

    }
}
