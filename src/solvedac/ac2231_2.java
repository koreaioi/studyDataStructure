package solvedac;

import java.util.Scanner;

public class ac2231_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n ; i++) {
            int num = i;
            int sum = i;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);


    }
}
