package solvedac;
import java.util.*;



public class ac1181_sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) str[i] = sc.next();

        str = Arrays.stream(str).distinct().toArray(String[]::new);

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);
                else return o1.length() - o2.length();
            }
        }
        );

        for (String s : str) {
            System.out.println(s);
        }



    }

}
