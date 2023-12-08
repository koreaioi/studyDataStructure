package solvedac;
import java.math.BigInteger;
import java.util.*;

public class ac1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;

        BigInteger bigNum = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            bigNum = bigNum.multiply(new BigInteger(Integer.toString(i)));
        }
        String num = bigNum.toString();
        for (int i = num.length() - 1; i > 0; i--) {
            if(num.charAt(i) == '0') count++;
            else break;
        }
        System.out.println(count);

    }

}
