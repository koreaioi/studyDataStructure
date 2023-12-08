package Sort;

import java.util.*;
public class Sort_04_solution {
    public static int[] solution(int[] arr, int s, int n) {
        int[] cache = new int[s];

       /* for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) if(x == arr[i]) pos = i;
            if(pos == -1){ //같은 값을 찾지 못했다면 즉, Cache Miss
                for (int i = s-1; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }else{
                for (int i = pos; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }*/

        for (int x : arr) {
            int pos = s - 1; //배열의 마지막 인덱스
            for(int i =0; i<s;i++)if(x==cache[i])pos=i;

            for (int i = pos; i > 0; i--) cache[i] = cache[i - 1];
            cache[0]=x;
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
