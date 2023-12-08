package Sort;
import java.util.*;

public class Sort_09 {
    public static int solution(int n, int m, int[] arr) {
        int length=1;
        int count = 0;
        int sum = 0;

        boolean flag = true;

        while(flag){
            count =0;
            sum =0;

            for (int i = 0; i < n; i++) {
                int tmp = arr[i];
                sum += tmp;

                if(length < sum) { //sum이 length를 뛰어넘으면
                    count++; //여기서 count++했는데 이미 m보다 높으면 탈락
                    if(count > m) break;
                    sum = tmp;
                }
            }
            //for문 종료 후
            count++;
            if(count <= m) return length;
            else length++;
        }

     /*   for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            sum += tmp;
            if(length < sum) {
                count++; //여기서 count++했는데 이미 m보다 높으면 탈락
                System.out.println(sum - tmp + ", " + count);
                if(count > m){
                    System.out.println("이 길이는 적절치 않다.");
                    length++;
                    count=0;
                    break;
                };
                sum = tmp;
            }
        }*/



        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}
