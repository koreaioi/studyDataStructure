package review;

import java.util.Scanner;

public class review03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int max = Integer.MIN_VALUE, pt;
        String answer = "";


        while(str.indexOf(' ') != -1){
            pt = str.indexOf(' ');
            String tmp = str.substring(0, pt);
            if(tmp.length() > max){
                max = tmp.length();
                answer = tmp;
            }
            str = str.substring(pt+1);
            System.out.println(str);
        }
        if(str.length() > max)answer = str; // 마지막 계산
        System.out.println(answer);

    }
}
