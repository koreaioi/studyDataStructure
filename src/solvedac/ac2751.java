package solvedac;
import java.util.*;

public class ac2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        ArrayList<Integer> AL = new ArrayList<>();
        for (int i = 0; i < n; i++) AL.add(sc.nextInt());
        Collections.sort(AL);
        for (int x : AL) {
            sb.append(x).append("\n");
        }
        System.out.println(sb);
    }
}
