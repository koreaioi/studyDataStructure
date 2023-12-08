package TwoPoint_SlideingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class _01twopointersalgorithm {
    public static ArrayList<Integer> solution(int[] arr1, int[] arr2, int n1, int n2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1 < n1 && p2 < n2){
            if(arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            }else{
                answer.add(arr2[p2++]);
            }
        }
        while(p1 < n1) answer.add(arr1[p1++]);
        while(p2 < n2) answer.add(arr2[p2++]);


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
            /*System.out.print(arr1[i] + " ");*/
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
            /*System.out.print(arr2[i] + " ");*/
        }


        for (int x : solution(arr1, arr2, n1 , n2)) {
            System.out.print(x + " ");
        }
    }
}
