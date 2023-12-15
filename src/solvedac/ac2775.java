package solvedac;

import java.util.Scanner;

public class ac2775 {
    public static int solution(int i, int j) {
        if(i ==0)return j;
        if(j ==1) return 1;

        return solution(i, j - 1) + solution(i - 1, j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(solution(a, b)).append("\n");
        }
        System.out.println(sb);


    }
}
