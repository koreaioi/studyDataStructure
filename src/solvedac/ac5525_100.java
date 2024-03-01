package solvedac;

import java.util.ArrayList;
import java.util.Scanner;

public class ac5525_100 {
    static int n,m, count,answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = sc.nextInt();
        m = sc.nextInt();
        String str = sc.next();
        ArrayList<Integer> al = new ArrayList<>(); //'I'의 index 위치를 저장
        for (int i = 0; i < m; i++) if(str.charAt(i) == 'I') al.add(i);
        count =0;

        for (int i = 1; i < al.size(); i++) {
            int tmp = al.get(i) - al.get(i - 1);
            if(tmp ==2)count++;
            else count=0;

            if(count >= n) answer++;
        }
        System.out.println(answer);
    }
}
