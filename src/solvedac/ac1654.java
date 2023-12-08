package solvedac;
import java.util.*;


public class ac1654 {
    public static int Count(int[] arr, long mid) {
        int n =0;
        for (int i = 0; i < arr.length; i++) {
            n += arr[i] / mid;
        }
        return n;
    }

    public static long solution(int[] arr, int n) {
        long lt = 1, answer = 0, rt;
        rt = Arrays.stream(arr).max().getAsInt(); //최댓값.
        long mid = 1;
        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if(Count(arr, mid) >= n){
                answer = mid;
                lt = mid + 1;
            }else rt = mid - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        //이분 검색
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[k];

        for(int i = 0;i<k;i++) arr[i] = sc.nextInt();

        long solution = solution(arr, n);
        System.out.println(solution);
    }
}
