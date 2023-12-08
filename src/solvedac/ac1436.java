package solvedac;
import java.util.*;


public class ac1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n번째 영화 출력, 1번쨰는 666, 2번째는 1666 ...
        int count = 1;
        int num = 666;
        while (n != count) {
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);
    }
}
