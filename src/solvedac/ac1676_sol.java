package solvedac;
import java.util.*;

public class ac1676_sol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        while(n >= 5){
            cnt += n / 5;
            n /= 5;
        }

        System.out.println(cnt);
    }
}
