package Algorythm_Array;

import java.util.Scanner;

public class Array10_solution {
    public static int solution(int[][] arr, int n) {
        int answer=0;
        //상하좌우 인덱스에 접근하기위해 dx, dy를 사용한다.
        //dx, dy를 사용하기 위해서 for문을 기존 보다 한 번 더 돈다.
        int[] dx = {-1, 0, 1, 0};
        int[] dy = { 1, 0,-1, 0};

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                //아래 반복문이 끝나면 한 격자칸의 숫자 상하좌우 탐색이 끝.
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = i + dy[k];
                    //상하좌우로 갈때 인덱스 범위를 넘어가면 안되므로 조건을 걸어준다.
                    //(arr[nx][ny] >= arr[i][j]) 이 부분을 꼭 조건 마지막에 달아야함!
                    if( nx > 0 && nx < n && ny <0 && ny <n && (arr[nx][ny] >= arr[i][j])){
                        flag = false;
                        break;
                    }
                }/*탐색 끝*/ if(flag==true) answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr, n));
    }
}
