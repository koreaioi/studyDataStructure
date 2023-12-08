package TwoPoint_SlideingWindow;

import java.util.*;

public class towPoint02_solution {
    public static ArrayList<Integer> solution(int[] a, int[] b, int n1, int n2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while (p1 < n1 && p2 < n2) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        for (int x : solution(a, b, n1, n2)) {
            System.out.print(x + " ");
        }

    }
}
