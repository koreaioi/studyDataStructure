package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ac2108 { //다시 공부

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        double sum = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        //정렬
        Arrays.sort(arr);

        int count = 0;
        int max = -1;
        //for문 한개로 돌리는 방식이기에 값이 1개이면 반복문이 돌지 않는다.
        //그렇기에 처음 최빈값은 배열의 첫번째 값으로 저장해 준다.
        int mod = arr[0];
        boolean check = false;
        //최빈값 구하는 반복문
        for(int i = 0; i < N - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++; //빈도수
            }else {
                count = 0;
            }

            if(max < count) { //빈도수를 갱신한다.
                max = count;
                mod = arr[i]; //최빈값도 갱신한다.
                check = true; //정렬후 빈도수가 높은게 나오면 그 수가 제일 작은 수(
                /* 정렬 후 빈도수가 높은게 나오면 그 수가 제일 작은 수(첫번째로 작은수)
                * 그래서 check 되어있는 상태에서 현재까지 for문에서의 최대빈도수(max)와 count가 같은 수면
                * 그 숫자가 두번째로 작은 수가 된다.
                * 하지만 for문은 끝까지 돌기 때문에 그 뒤에 더 높은 빈도수가 나오면 mod가 갱신된다.
                * */
            }else if(max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }
        System.out.println(Math.round(sum / N));
        System.out.println(arr[(N - 1) / 2]);
        System.out.println(mod);
        System.out.println(arr[N - 1] - arr[0]);
    }

}