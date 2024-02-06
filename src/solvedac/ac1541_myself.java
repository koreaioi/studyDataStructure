package solvedac;

import java.util.*;

public class ac1541_myself {
    public static int changeStr(String str) {
        String tmp = "";
        int sum=0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if (c == '+') {
                sum += Integer.parseInt(tmp);
                tmp ="";
            } else tmp += c;
        }
        sum += Integer.parseInt(tmp);

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Queue<String> q = new LinkedList<>();

        String tmp = "";
        for (int i = 0; i < str.length(); i++) { // 토큰화
            char c = str.charAt(i);
            if (c == '-') {
                q.add(tmp);
                tmp = "";
            } else tmp += c;
        }
        q.add(tmp);
        // '-'를 기준으로 토큰화

        int sum = changeStr(q.poll()); //처음만 더하고
        while (!q.isEmpty()) sum -= changeStr(q.poll()); //그 뒤로는 뺀다.


        System.out.println(sum);



    }
}
