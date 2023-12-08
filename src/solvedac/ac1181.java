package solvedac;
import java.util.*;


class strSort implements Comparable<strSort> {
    String str;

    strSort(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(strSort tmp) {
        if(this.str.length() != tmp.str.length()) return this.str.length() - tmp.str.length();
        else{
            int num = this.str.length();
            for (int i = 0; i < num; i++) {
                int a = this.str.charAt(i);
                int b = tmp.str.charAt(i);
                if(a!=b) return a - b;
            }
        }
        return 0;
    }
}

public class ac1181 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++){
            set.add(new String(sc.next()));
        }

        List<strSort> AL = new ArrayList<>();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            AL.add(new strSort(it.next()));
        }
        Collections.sort(AL);

        for (strSort s : AL) {
            System.out.println(s.str);
        }
    }
}
