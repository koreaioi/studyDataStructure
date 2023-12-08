package HashMap_TreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap_01 {
    public static char solution(String s, int n) {
        char answer = 'F';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            //map.getOrDefault는 x라는 키가 존재하면 해당 x의 value를 리턴, 아직 없으면 0 리턴
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;

            }
        }


        return answer;
    }

    /*HashMap은 key와 value로 이루어짐
    * map.get()은 해당 key의 value 값을 리턴한다.
    *
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(str, n));

    }
}
