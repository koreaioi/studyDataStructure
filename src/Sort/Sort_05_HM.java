package Sort;

import java.util.*;
public class Sort_05_HM {
    public static char solution(int[] arr) {

      /*  HashMap<Integer, Integer> HM = new HashMap<>();
        for(int x: arr){
            HM.put(x, HM.getOrDefault(x, 0) + 1);
            if(HM.get(x) > 1) return 'D';
        }*/

     /*   for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]) return 'D';
            }
        }*/

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[i+1]) return 'D';
        }
        return 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(solution(arr));
    }
}
