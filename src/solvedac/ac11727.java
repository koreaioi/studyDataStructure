package solvedac;


import java.util.Scanner;

public class ac11727 {
    /*
     * Idea
     * 2*1 을 채우기 위한 방법 -> 1가지
     * 2*2 를 채우기 위한 방법 -> 3가지
     * 2*3 을 채우기 위한 방법 -> 5가지
     * 설마 피보나치?
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[1001];
        arr[1] = 1;
        arr[2] = 3;
        for (int i = 3; i <= n; i++)
            arr[i] = (arr[i - 1] + 2 * arr[i - 2]) % 10007;

        System.out.println(arr[n]);
    }
}
