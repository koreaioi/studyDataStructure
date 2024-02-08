package GreedyAlgorithm;
import java.sql.Time;
import java.util.*;

public class greedy_02_myself {

    public static int n;
    public static Time[] times;
    public static HashMap<Integer, Integer> HM;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        times = new Time[n];
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
/*
            times[i] = new Time(n1, n2);
*/
            if(HM.getOrDefault(n1, Integer.MAX_VALUE) < n2)HM.put(n1, n2);
            else HM.put(n1, HM.get(n1));
        }
        Arrays.sort(times);
        ArrayList<Integer> al = new ArrayList<>(HM.keySet());
        Collections.sort(al);

        for (int x : al) {
            System.out.println(x + " " + HM.get(x));
        }


/*        for (Time t : times) {
            System.out.println(t.first + " " +t.end);
        }*/


    }

    static class Time implements Comparable<Time>{
        int first,end;

        public Time(int first, int end) {
            this.first = first;
            this.end = end;
        }


        @Override
        public int compareTo(Time o) {
            if(first == o.first){
                return end - o.end;
            }
            return first - o.first;
        }
    }
}
