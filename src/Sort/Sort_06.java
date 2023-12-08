package Sort;

import java.util.*;


public class Sort_06 {
    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] clone = arr.clone();
        Arrays.sort(clone);

        for (int i = 0; i < clone.length; i++) {
            if(arr[i]!= clone[i]) answer.add(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int x : solution(arr)) System.out.print(x + " ");

    }
}
