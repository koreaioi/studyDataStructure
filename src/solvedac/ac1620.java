package solvedac;
import java.rmi.server.RMIClientSocketFactory;
import java.util.*;

public class ac1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        Pokemon[] arr1 = new Pokemon[n];
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            names[i] = str;
            arr1[i] = new Pokemon(str, i + 1);
        }

        Pokemon[] arr2 = arr1.clone();
        Arrays.sort(names); //정렬
        Arrays.sort(arr2);

/*        for (Pokemon p : arr) {
            System.out.println(p.name + " " + p.firstIndex);
        }*/

        for (int i = 0; i < m; i++) {
            String str = sc.next();
            int num=0;
            if (Character.isDigit(str.charAt(0))){ //숫자면
                num = Integer.parseInt(str);
                sb.append(arr1[num-1].name+"\n");
            }else{
                int index = Arrays.binarySearch(names, str);
                sb.append(arr2[index].firstIndex + "\n");
            }
        }
        System.out.println(sb);

    }

    static class Pokemon implements Comparable<Pokemon>{
        String name;
        int firstIndex;

        public Pokemon(String name, int firstIndex) {
            this.name = name;
            this.firstIndex = firstIndex;
        }

        @Override
        public int compareTo(Pokemon o) {
            return name.compareTo(o.name);
        }
    }
}
