package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ac1931 {
    public static int n;
    public static Time[] times;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        times = new Time[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            times[i] = new Time(n1, n2);
        }
        Arrays.sort(times);
        int last_time=times[0].last;
        int count=1;
        for (int i = 1; i < n; i++) {
            if(last_time <= times[i].first) {
                last_time = times[i].last;
                count++;
            }
        }
        System.out.println(count);
    }

    static class Time implements Comparable<Time>{
        int first,last;

        public Time(int first, int last) {
            this.first = first;
            this.last = last;
        }

        @Override
        public int compareTo(Time t) {
            if(last == t.last) return first - t.first;
            return last - t.last;
        }
    }
}
