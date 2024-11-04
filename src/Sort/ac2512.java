package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ac2512 {

    /*
    * 1. 적절한 상한액을 이분 탐색으로 정한다.
    * 2. 상한액으로 예산 초과가 나는지 확인한다.
    * */

    static int n;
    static long max; // 1,000,000,000
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        max = Long.parseLong(st.nextToken());

        int lt = 1;
        int rt = Arrays.stream(arr).max().getAsInt();
        int result =0;
        while(lt <= rt){
            int mid = lt + (rt - lt)/2; // 상한액, overflow 방지

            // 이정도 상한액은 OK -> 더 큰 상한액으로 하면 초과나는 지 확인해봐야한다.
            if(solution(mid) <= max){
                result = mid; // 일단 통과된 상한액을 result에 저장한다.
                lt = mid + 1;
            }else{// 상한액이 너무 커서 예산초과 -> 상한액을 줄인다.
                rt = mid - 1;
            }
        }

        System.out.println(result);

    }

    // 주어진 상한액에 대하여 합산을 구하는 메소드
    static int solution(int mid){
        int sum = 0;
        for (int x : arr) {
            if(x > mid){
                sum+= mid;
            }else {
                sum += x;
            }
        }

        return sum;
    }
}
