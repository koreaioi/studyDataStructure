package Algorythm_String;

import java.util.Scanner;
public class String05 {
    public static String solution(String str) {
        char[] chArr = str.toCharArray(); //chArr은 char 배열로 전환한 str
        String tmp = "";

        //반복문 1. chArr에 알파벳을 tmp에 저장해주는 반복문
        for (int i = 0; i < chArr.length; i++) {
            if((65<=(int)chArr[i] && (int)chArr[i] <= 90) || (97 <= (int)chArr[i] && (int)chArr[i] <=122)){
                tmp += chArr[i];
            }
        }

        //알파벳만 있는 String타입 tmp를 char 배열로 전환.
        char[] tmpArr = tmp.toCharArray();

        //반복문 2. tmpArr를 뒤집어주는 알고리즘.
        for (int i = 0; i < tmpArr.length /2; i++) {
            char tmp1 = tmpArr[i];
            tmpArr[i] = tmpArr[tmpArr.length - i - 1];
            tmpArr[tmpArr.length - i - 1] = tmp1;
        }

        int count = 0; //chArr과 tmpArr 배열의 크기가 다르므로 tmpArr 인덱스를 증감해주는 변수를 따로 초기화

        //반복문 3. tmpArr의 알파벳을 chArr에 넣어주는 반복문.
        for (int i = 0; i < chArr.length; i++) {
            if((65<=(int)chArr[i] && (int)chArr[i] <= 90) || (97 <= (int)chArr[i] && (int)chArr[i] <=122)){
                chArr[i] = tmpArr[count++];
            }
        }

        //chArr을 String으로 바꿔줌
        String answer = String.valueOf(chArr);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = solution(str);
        System.out.println(answer);
    }
}
