package Sort;

import java.util.*;

//최솟값을 탐색해 앞에 배치하는 정렬이다.
public class Sort_01_selection {
    public static int[] solution(int[] arr) {
        //내가 선택정렬 원리만 보고 짠 코드
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i; //최솟값의 인덱스
            for (int j = i+1; j < arr.length; j++) { //최솟값을 찾는 과정
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            } //이제 저장된 min와 index를 위치 swap
            int tmp = arr[i];
            arr[i] = min;
            arr[index] = tmp;
        }


/*        //강의 코드
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]) index = j;
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }*/

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int x : solution(arr)) System.out.print(x + " ");

    }
}
