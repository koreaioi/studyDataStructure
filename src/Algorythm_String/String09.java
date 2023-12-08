package Algorythm_String;

import java.util.Scanner;

public class String09 {
    public static String solution(String str) {
        String answer ="";
        String tmp1 = "";
        String tmp2 = "";
        //숫자만 추출하는 알고리즘
        for (int i = 0; i < str.length(); i++) {
            if(48 <= (int)str.charAt(i) && (int)str.charAt(i) <= 57) tmp1 += str.charAt(i);
        }

        //숫자만 추출한 String을 char[]에 따로 저장.
        char[] chArr = tmp1.toCharArray();
        int i= 0;

        //맨 앞이 0이면 !로 바꾼후 빈칸으로 바꾸기
        //001205여도 가능
        while(chArr[i] == '0'){
            chArr[i++] = '!';
        }
        tmp1 = String.valueOf(chArr).replace('!', ' ').trim();
        System.out.println(tmp1);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));


    }
}

/*//중복된 수를 걸러주는 알고리즘
        for (int i = 0; i < tmp1.length(); i++) {
        if( tmp1.indexOf(tmp1.charAt(i))== i) tmp2 += tmp1.charAt(i);
        }*/

/*
    char[] chArr = tmp2.toCharArray();
//버블 정렬
        for (int i = 0; i < chArr.length - 1; i++) {
        for (int j = 0; j < chArr.length - 1 - i; j++) {
        if(chArr[j] > chArr[j+1]){
        char tmp = chArr[j];
        chArr[j] = chArr[j + 1];
        chArr[j+1] = tmp;
        }
        }
        }
        String answer = String.valueOf(chArr);*/
