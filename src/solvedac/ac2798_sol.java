package solvedac;

import java.util.Arrays;
import java.util.Scanner;

public class ac2798_sol {
    //Scanner 사용시 메모리 17768 시간 224
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int answer=0;
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        for(int i = 0; i < n;i++){
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int num = arr[i] + arr[j] + arr[k];
                    if(num <= m){
                        answer = Math.max(answer, num);
                    }
                    else break;
                }
            }
        }
        System.out.println(answer);

    }
}
