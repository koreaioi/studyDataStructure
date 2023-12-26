package solvedac;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ac10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> HM = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            HM.put(tmp, HM.getOrDefault(tmp, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();

        int m = sc.nextInt();
        for(int i = 0;i<m;i++){
            int tmp = sc.nextInt();
            int num=0;
            if(HM.get(tmp)==null) sb.append(0).append(" ");
            else {
                num = HM.get(tmp);
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb);


    }
}
