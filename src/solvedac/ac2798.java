package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ac2798 {
    //BufferedReader와 StringTokenizer 사용시 메모리 14256  시간 124
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); //누적합
        int[] arr = new int[n];
        int sum=0;
        int answer=0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        for(int i = 0; i < n;i++){
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int num = arr[i] + arr[j] + arr[k];
                    if(num <= m){
                        answer = Math.max(answer, num);
                    }
                    else break;
                }
            }
        }
        System.out.println(answer);

    }

}
