package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class stack_03 {


    public static int solution(int[][] boardArr, int n, int[] movesArr) {
        int answer = 0;
        Stack<Integer> num = new Stack<>();
        num.push(0);

        //크레인이 배열에서 집는 과정
        for (int i = 0; i < movesArr.length; i++) {
            int lift = movesArr[i] - 1;

            for (int j = 0; j < n; j++) {
                //격자판이 0이면 그 아래칸을 크레인으로 뽑고자한다.
                if(boardArr[j][lift] > 0) {
                    //stack의 peek와 같은 인형일 경우 스택 pop (+ 격자판 인형도 제거)
                    if(boardArr[j][lift] == num.peek()) {
                        num.pop();
                        boardArr[j][lift] = 0;
                        answer = answer + 2; //같은 인형끼리 터지니까 +2
                        break;
                    }
                    //같은 인형이 아니면 격자판에 있는 걸 옮기고 stack에 푸쉬
                    num.push(boardArr[j][lift]);
                    boardArr[j][lift] =0; 
                    break;
                }
                if((boardArr[j][lift] == 0) && (j == n-1)) break;
            }


        }
        return answer;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] boardArr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boardArr[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] movesArr = new int[m]; //크레인의 이동 경로
        for (int i = 0; i < m; i++) {
            movesArr[i] = sc.nextInt();
        }

        System.out.println(solution(boardArr, n, movesArr));


/*
        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++) {
                System.out.print(boardArr[i][j] + " ");
            }
            System.out.println();
        }
*/



    }
}
