package solvedac;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ac3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();

        for(int i = 0; i < 10 ;i++){
            int tmp = sc.nextInt();
            s.add(tmp % 42);
        }
        System.out.println(s.size());
    }
}
