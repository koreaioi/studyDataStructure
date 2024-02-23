package solvedac;
import java.util.*;

public class ac5525 {

    public static int count=0;

    public static String makeIoI(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "IO";
        }
        return str + "I";
    }

    public static void solution(String str, String ioi) {

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='I' && i+ioi.length()-1 < str.length()){ //String ioi인지 확인
                if (str.substring(i, i + ioi.length()).equals(ioi)) {
                    count++;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        String ioi = makeIoI(n);

        solution(str, ioi);

        System.out.println(count);
    }
}
