package HashMap_TreeSet;

import java.util.*;

public class HashMap_03_solution {
    public static ArrayList<Integer> solution(int[] arr, int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        for (int i = 0; i < k - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt]) - 1);
            if(HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
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
