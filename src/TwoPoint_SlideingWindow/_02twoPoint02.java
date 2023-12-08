package TwoPoint_SlideingWindow;

import java.util.*;

public class _02twoPoint02 {
    /*public static ArrayList<Integer> solution(int[] a, int [] b, int n1, int n2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(a[i] == b[j]) answer.add(a[i]);
            }
        }
        return answer;
    }*/

    public static ArrayList<Integer> solution(Set a, Set b, int n1, int n2) {
        a.retainAll(b);
        ArrayList<Integer> answer = new ArrayList<>(a);
        Collections.sort(answer);


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            a.add(sc.nextInt());
        }


        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            b.add(sc.nextInt());
        }

        for (int x : solution(a, b, n1, n2)) {
            System.out.print( x + " ");
        }


    }
}
