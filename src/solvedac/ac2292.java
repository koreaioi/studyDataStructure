package solvedac;

import java.util.Scanner;

public class ac2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0, count = 1;
        while (true) {
            if(n <= count) break;
            else {
                i++;
                count += 6 * i;
            }
        }
        System.out.println(i + 1);
    }

}
