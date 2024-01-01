package solvedac;

import java.util.Scanner;

public class ac1074 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //차수
        int r = sc.nextInt();
        int c = sc.nextInt();
        //r행 c열
        int size = (int) Math.pow(2, n); //변의 길이

        findZ(size, r, c);
        System.out.println(count);


    }
    //변의 길이는 1/2씩 줄어든다.
    /*
    * 1사분면 size는 1/2배 r과 c도 그대로
    * 2사분면 size는 1/2배 c가 size/2 만큼 상대위치 감소
    * 3사분면 size는 1/2배 r이 size/2 만큼 상대위치 감소
    * 4사분면 size는 1/2배 r과 c가 size/2 만큼 상대위치 감소
    * */
    public static void findZ(int size, int r, int c) {
        if(size ==1) return;
        int half = size / 2;
        if (r < half)
        {
            if(c <half) {
                findZ(size / 2, r, c);
            }
            else {
                count += (size * size / 4);
                findZ(half, r, c - half);
            }
        } else {
            if (c < half) {
                count += (size * size / 4) * 2;
                findZ(half, r-half, c);
            }
            else {
                count += (size * size / 4) * 3;
                findZ(half, r - size / 2, c - size / 2);
            }
        }



    }

}
