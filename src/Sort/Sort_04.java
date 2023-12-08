package Sort;

import java.util.*;

public class Sort_04 {
    public static int[] solution(int[] arr, int s, int n) {
        int[] cache = new int[s];

        for (int i = 0; i < n; i++) { //작업 수
            int tmp = arr[i];
            for (int j = 0; j < s; j++) { //캐시안에 같은 작업이 있는지 찾기
                if(tmp == cache[j]){
                    //캐시 안에 있는 같은 작업이 있으면(Hit) 그 작업 맨 앞으로, 나머지는 뒤로
                    for (int k = j; k > 0; k--) cache[k] = cache[k - 1];
                    cache[0] = tmp;
                    tmp = 0;
                    break;
                }
            }
            //만약 캐시안에 같은 작업이 없다면 (Miss)
            if(tmp != 0){
                for (int j = s - 1; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = tmp;
            }
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); //캐시의 크기
        int n = sc.nextInt(); //작업의 개수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int x : solution(arr, s, n)) System.out.print(x + " ");

    }
}
