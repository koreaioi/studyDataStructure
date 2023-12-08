package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_03 {
    public static int[] solution(int[] arr, int n, int k) {
        int[] answer = new int[n - k + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt=0;
        int count = 0;

        for (int rt = 0; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            count++;
            while (count == k) {
                answer[lt] =map.size();
                map.put(arr[lt], map.get(arr[lt])-1);
                if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
                lt++;
                count--;
            }
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

        for (int x : solution(arr, n, k)) {
            System.out.print(x + " ");
        }

    }


}

/*  시간초과
    private static int[] solution(int[] arr, int n, int k) {
        int[] answer = new int[n - k + 1];
        //key는 매출액 value 매출액의 개수
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n - k + 1; i++) {
            map.clear();
            int j = i+k;
            for (int cnt = i; cnt < j; cnt++) {
                map.put(arr[cnt], map.getOrDefault(arr[cnt], 0)+1);
            }
            answer[i] = map.size();
        }
        return answer;
    }*/
