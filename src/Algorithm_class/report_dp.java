package Algorithm_class;

public class report_dp {

    public static void main(String[] args) {
        int N=10;
        int[] elements = {2, 3, 5, 6};
        int[][] arr = new int[elements.length][N+1];

        for (int i = 0; i < elements.length; i++) {
            for (int j = 1; j <= N; j++) {
                if(j==0) arr[i][j]=1; // 모든 행의 0열은 1
                else if (i==0 && j % elements[i]==0) arr[i][j] = 0; // 0행 초기화

                // 만드려는 값 j가 사용하려는 원소보다 작아서 못만드는경우
                else if (j < elements[i]) arr[i][j] = arr[i - 1][j];
                else{ // 일반적인 경우
                    arr[i][j] = arr[i - 1][j] = arr[i][j - elements[i]];
                }
            }
        }
        return arr[elements.length][N];
    }



}


    public int findSumCase() {
        int N=10;
        int[] elements = {2, 3, 5, 6};
        int[][] arr = new int[elements.length][N+1];

        for (int i = 0; i < elements.length; i++) {
            for (int j = 1; j <= N; j++) {
                if(j==0) arr[i][j]=1; // 모든 행의 0열은 1
                else if (i==0 && j % elements[i]==0) arr[i][j] = 0; // 0행 초기화

                    // 만드려는 값 j가 사용하려는 원소보다 작아서 못만드는경우
                else if (j < elements[i]) arr[i][j] = arr[i - 1][j];
                else{ // 일반적인 경우
                    arr[i][j] = arr[i - 1][j] = arr[i][j - elements[i]];
                }
            }
        }
        return arr[elements.length][N];
    }
