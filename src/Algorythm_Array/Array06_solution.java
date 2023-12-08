package Algorythm_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array06_solution {
    public static boolean isPrime(int n) {
        if(n == 1) return false;
        else if (n >= 2) {
            for (int i = 2; i <n ; i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> solution(int[] intArr, int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = intArr[i];
            int res=0;
            while(tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10; //tmp /=10;
            }
            //System.out.println(res);
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }
        for (int x : solution(intArr, n)) {
            System.out.print(x + " ");
        }
    }
}
