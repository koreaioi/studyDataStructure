package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp_LIS {

    /*
    * 자기 자신보다 이전 인덱스 중에서
    * 자기 자신보다 작은 값(arr 기준)을 찾아낸다. (증가 수열이니까)
    * 해당 값들의 dp 중에서 가장 큰 값 + 1을 dp[자기자신]에 저장한다.
    * 반복문이 종료되면 dp 배열에서 가장 큰 값을 출력한다. (반복문 한번 더 쓰기 싫어서 Math.max(result. dp[i])
    * */

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1];  // 주어진 숫자가 저장되는 배열
        int[] dp = new int[n+1];     // 해당 인덱스에서 최대 부분 증가수열의 길이를 저장
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = i; j > 0; j--) {
                if(arr[i] > arr[j]){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);

    }
}
