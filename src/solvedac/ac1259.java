package solvedac;
import java.util.*;


public class ac1259 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            String answer = "yes";
            if(num ==0) return;

            String str = Integer.toString(num);
            for (int i = 0; i < str.length() / 2; i++) {
                if(str.charAt(i)!= str.charAt(str.length()-i-1)) answer = "no";
            }
            System.out.println(answer);
        }

    }
}
