package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class binarySearch02 {

    static int n, count;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        count = Integer.parseInt(st.nextToken());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long lt = 1;
        long rt = Arrays.stream(arr).max().getAsInt();
        long result =0;

        while(lt <= rt){
            long mid = lt + (rt - lt)/2;

            if(solution(mid) >= count){
                result = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
            }
        }

        System.out.println(result);
    }

    public static long solution(long mid){
        long sum = 0;
        for (int x : arr) {
            sum += x / mid;
        }

        return sum;
    }

}
