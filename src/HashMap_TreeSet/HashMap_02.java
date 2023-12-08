package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_02 {
    public static String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for (char key : map1.keySet()) {
            /*System.out.println(map1.get(key) + " : " + map2.get(key));*/
            if(map1.get(key) != map2.get(key)) answer = "NO";
        }

        for (char key : map2.keySet()) {
            if(map1.get(key) != map2.get(key)) answer = "NO";
        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        /*System.out.println(s1);
        System.out.println(s2);*/

        System.out.println(solution(s1, s2));
    }
}
