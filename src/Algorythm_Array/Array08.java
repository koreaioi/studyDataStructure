package Algorythm_Array;

import java.util.Scanner;

public class Array08 {
    public static int[] solution(int[] intArr, int n) {
        int[] answer = new int[n];

        int index=0;
        int rank=1;

        for (int i = 0; i < n; i++) {
            int max = 0;
            //최댓값 찾기
            for (int j = 0; j < n; j++) {
                if(intArr[j] > max) {
                    max= intArr[j];
                    index = j;      //max값인 수의 인덱스 저장
                }
            }
            //answer[index]에 랭크를 적는다.
            answer[index] = rank;
            intArr[index] = -1;
            //같은 점수가 있으면 높은 동일 점수로 처리한다.
            for (int j = 0; j < n; j++) {
                if(max == intArr[j]){
                    answer[j] = answer[index];
                    intArr[j] = -1;
                    rank++;
                }
            }
            rank++;
            //answer가 다 입력되면 for문을 탈출해야함
            //탈출하지 않으면 마지막에 입력된 answer가 계속 갱신된다.
            //rank == n+1 이면 answer 배열이 다 찼음을 의미
            if(rank == n+1)break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        for (int x : solution(intArr, n)) {
            System.out.print(x + " ");
        }

    }
}
