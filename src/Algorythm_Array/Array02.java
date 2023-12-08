package Algorythm_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array02 {
    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if(max < arr[i]){
                answer.add(arr[i]);
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr).size());;

    }

}
