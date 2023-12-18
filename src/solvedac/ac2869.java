package solvedac;

import java.util.Scanner;

public class ac2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int day=0;

        int n1 = v - b;
        int n2 = a - b;
        day = (n1 / n2);
        if(n1 % n2 != 0) day++;
        System.out.println(day);

        /* 2 1 6 이라고 할 때
         * 항상 a 만큼 올라가서 v 보다 이상이면 끝이다.
         * 하루에 결과적으로 a - b 만큼 올라가게 된다. (변위)
         * a - b 만큼 반복할 때 결과적으로 v - b 보다
         * 높으면 그날 밤 b 만큼 내려온 걸 감안해도 v에 도달했다는 것.
         * 즉 v - b 나누기 a - b 인데 나머지는 올림으로 해야한다.
         * 밤에 내려온걸 감안한 도달 거리 = 5 (6-1)
         * 매일 변위는 1만큼 변한다.
         * 내려온 걸 감안한 도달 거리 5를 변위로 나누면 5로 나누어 떨어져
         * 5가 답이다.
         * 내려온 걸 감안하는 것이 포인트
         */


    }
}
