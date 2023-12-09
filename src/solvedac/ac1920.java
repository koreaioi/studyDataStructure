package solvedac;
import java.util.Arrays;
import java.util.Scanner;

public class ac1920 {
    //정렬 후 이분 탐색으로 찾기

    public static int binarySearch(int[] arr1, int n) {
        int lt = 0;
        int rt = arr1.length-1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr1[mid] > n) rt = mid - 1;
            else if(arr1[mid] < n) lt = mid + 1;
            else return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력 값
        int n = sc.nextInt();
        int[] arr1 = new int[n]; //2의 31승 ~ 2의 -31승까지 범위 이므로 int 형 사용 가능
        for(int i = 0; i <n;i++) arr1[i] = sc.nextInt();
        Arrays.sort(arr1); //이분 탐색을 위해서 arr 정렬

        int m = sc.nextInt();
        int[] ch = new int[m];

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<m;i++){
            int tmp = sc.nextInt();
            //이분 탐색으로 tmp가 있는지 찾기
            int check = binarySearch(arr1, tmp);
            if(check > 0 ) sb.append('1').append('\n');
            else sb.append('0').append('\n');
        }
        System.out.print(sb.toString());

    }

}
