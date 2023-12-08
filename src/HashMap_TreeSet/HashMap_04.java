package HashMap_TreeSet;

import java.util.*;

public class HashMap_04 {
    public static int solution(String s, String t) {
        int answer = 0, count = 0;
        HashMap<Character, Integer> HM1 = new HashMap<>();
        HashMap<Character, Integer> HM2 = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            HM1.put(t.charAt(i), HM1.getOrDefault(t.charAt(i), 0) + 1);
        }

        int lt=0;
        for (int rt = 0; rt < s.length(); rt++) {
            HM2.put(s.charAt(rt), HM2.getOrDefault(s.charAt(rt), 0) + 1);
            count++;
            while (count == t.length()) {
                if(HM1.equals(HM2)) answer++;
                HM2.put(s.charAt(lt), HM2.get(s.charAt(lt)) - 1);
                if(HM2.get(s.charAt(lt)) == 0) HM2.remove(s.charAt(lt));
                lt++;
                count--;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.next();

        System.out.println(solution(s ,t));

    }
}
