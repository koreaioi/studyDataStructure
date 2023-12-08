package HashMap_TreeSet;

import java.util.*;

public class TreeSet_05 {
    public static int solution(int[] arr, int n, int k) {
        int answer = -1;
        //TreeSet에 add할 때 내림차순으로 정렬
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int count = 0;
        for (int x : Tset) {
            count++;
            if(count == k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, n ,k));

    }
}
