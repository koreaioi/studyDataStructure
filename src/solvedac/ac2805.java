package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ac2805 {
    static int[] arr;
    static int n,m, answer;
    static long sum;
    /*
    * 단일 나무의; 최대 길이가 10억 (1,000,000,000)
    * 합산 과정에서 overflow가 발생하지 않도록 sum은 long타입!
    * */

    public static void solution() {
        int lt = 1;
        int rt = Arrays.stream(arr).max().getAsInt();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            long result = cutTree(mid);
            if (result >= m) {
                lt = mid + 1;
                answer = Math.max(mid, answer);
            } else rt = mid - 1;
        }
    }

    public static long cutTree(int mid) {
        sum =0;
        for (int x : arr) {
            if (x - mid > 0) sum += (x - mid);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken()); //원하는 값
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        answer = 0;
        solution();

        System.out.println(answer);

    }
}
/*

 while (p1 > p2) {
         if(arr[p1] > limit) break;
         if(sum < limit){
        sum += arr[p1];
        p1++;
        }else if(sum > limit){
        p2++;
        sum -= arr[p2];
        }else break;
        }*/
