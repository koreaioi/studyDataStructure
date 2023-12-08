package Algorythm_String;

import java.util.Scanner;

public class String12 {
    final static int SEVEN = 7;

    public static String solution(String s, int num) {
        String answer ="";

        s = s.replaceAll("#", "1").replaceAll("\\*", "0");


        String[] strArr = new String[num];
        for (int i = 0; i < num; i++) {
            strArr[i] = s.substring(i * SEVEN, (i + 1) * SEVEN);
        }
        for (int i = 0; i < num; i++) {
            answer += (char)(Integer.parseInt(strArr[i], 2));
            //Integer.parseInt 하면 	1000001 -> 65 (int형)
            //이걸 char로 형변환시 아스키 코드 65에 해당하는 a 로 변환됨!
        }
        //인덱스 0 ~ 인덱스 6
        //인덱스 7 ~ 인덱스 13
        //인덱스 14 ~ 인덱스 20
        //인덱스 21 ~ 인덱스 27
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();
        System.out.println(solution(s, num));
    }
}
