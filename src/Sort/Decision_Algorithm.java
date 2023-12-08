package Sort;
import java.util.*;

public class Decision_Algorithm {
    public static int count(int[] arr, int capacity) { //용량 확인 작업
        int cnt=1; //DVD 장수
        int sum=0;
        for(int x : arr){
            sum += x;
            if (sum > capacity) {
                cnt++;
                sum = x;
            }

            /*if (sum + x > capacity) {
                cnt++;
                sum = x;
            }else sum+=x;*/
        }
        return cnt;
    }

    public static int solution(int[] arr, int n, int m) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); //max()는 OptionalInt로 감싸진다. 이걸 벗겨내야함
        int rt = Arrays.stream(arr).sum(); //sum()은 옵셔널이 아니라 int를 반환해서 안벗겨도됨

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m){
                answer = mid;
                rt = mid - 1; //mid 보다 더 적은 용량으로 담을 수 있는지.
            }
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int sum =0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, n, m));
    }
}
