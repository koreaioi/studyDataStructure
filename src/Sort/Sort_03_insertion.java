package Sort;

import java.util.*;
public class Sort_03_insertion {
    public static int[] solution(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            int target = arr[i];
            int j;
            //나보다 큰 아래 인덱스 값(j = i -1)들을 뒤로 미루고 나보다 작은 값이 나오면(j+1) 그 뒤에 저장한다.
            for (j = i - 1; j >= 0; j--) {
            if (arr[j] > target) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = target;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for(int x : solution(arr, n)) System.out.print(x + " ");
    }
}
