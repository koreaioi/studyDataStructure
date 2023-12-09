package solvedac;
import java.util.Scanner;

public class ac1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[] arr = new boolean[m+1]; //기본 값 0
        arr[0] = arr[1] = true;
        for (int i = 2; i <= Math.sqrt(m+1); i++) {
            if(!arr[i]){
                for (int j = i*i; j <= m; j = j + i) {
                    //i의 배수는 모두 1로 처리해 소수가 아님을 표시
                    arr[j] = true;
                }
            }
        }
        //일일히 sout로 찍어내는 것 보다
        //sb에 append한 뒤 한 번 출력하는게 더 빠르다.
        for(int i =n ; i <=m ;i++){
            if(!arr[i]) sb.append(i).append('\n');
        }
        System.out.println(sb);


    }
}
