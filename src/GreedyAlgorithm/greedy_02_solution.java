package GreedyAlgorithm;
import java.util.*;

public class greedy_02_solution {

    public static int n;
    public static Time[] times;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        times = new Time[n];
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            times[i] = new Time(n1, n2);
        }
        Arrays.sort(times);
/*
        for (Time t : times) {
            System.out.println(t.first + " " +t.end);
        }*/
        int previous_time=0;
        int count=0;

        for (int i = 0; i < times.length; i++) {
            if (previous_time <= times[i].first) {
                previous_time = times[i].end;
                count++;
            }
        }

        System.out.println(count);
    }

    static class Time implements Comparable<Time>{
        int first,end;

        public Time(int first, int end) {
            this.first = first;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if(end == o.end){
                return first - o.first;
            }
            return end - o.end;
        }
    }
}
