package solvedac;

import java.util.Scanner;

public class ac2563 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] board = new int[100][100];
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    if(board[j][k] == 0) {
                        board[j][k]=1;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
