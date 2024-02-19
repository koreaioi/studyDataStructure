package GreedyAlgorithm;
import java.util.*;

public class greedy_03_solution {
    static int n;
    static ArrayList<Time> al = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            al.add(new Time(n1, 's'));
            al.add(new Time(n2, 'e'));
        }
        Collections.sort(al);
/*        for(Time t : al) System.out.println(t.time + " " + t.status);
        */
        int count=0;
        int answer=0;
        for (Time t : al) {
            if(t.status =='s') count++;
            else count--;

            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }

    static class Time implements Comparable<Time>{
        int time;
        char status;

        public Time(int time, char status) {
            this.time = time;
            this.status = status;
        }

        @Override
        public int compareTo(Time o) {
            if(time == o.time) return status - o.status;
            return time - o.time;
        }
    }
}
