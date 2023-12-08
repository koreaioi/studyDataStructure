package Stack_Queue;

import java.util.*;
//Queue 문제인데 HashMap을 사용해서 풀었다.
public class Queue_02_HM {
    public static String solution(String str1, String str2) {
        String answer = "YES";
        int count=1; //나와야할 순서
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) map.put(str1.charAt(i), i + 1);
        //C - 1, B - 2, A - 1

        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                if (map.get(str2.charAt(i)) != count) return "NO";
                else {
                    map.remove(str2.charAt(i));
                    count++;
                }
            }
        }
        if(!map.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(); //교육과정 순서
        String str2 = sc.next(); //시간표

        System.out.println(solution(str1, str2));
    }
}
