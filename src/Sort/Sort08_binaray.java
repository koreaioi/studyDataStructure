package Sort;
import java.util.*;

public class Sort08_binaray {
    public static int solution(int[] arr, int m) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = arr.length-1;
        int mid=0;
        while (lt <= rt) {
            mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                answer = mid+1;
                break;
            }
            if(arr[mid] > m) rt = mid-1; //중앙값이 m 보다 오른쪽에 있으므로 rt를 옮겨준다.
            else lt = mid +1;
        }
    /*    for (int i = 0; i < arr.length; i++) {
            mid = (lt + rt) / 2;

            if(arr[mid] > m)rt = mid-1;
            else if(arr[mid] < m) lt = mid+1;
            else if(arr[mid] == m){
                answer = mid + 1; //arr[mid] == m
                break;
            }
        }*/




        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, m));
    }
}
