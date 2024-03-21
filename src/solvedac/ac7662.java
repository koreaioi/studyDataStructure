package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ac7662 {
    //우선 순위 큐 기본은 가장 작은 값
    static int t, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> FrontQueue = new PriorityQueue<>();
        PriorityQueue<Integer> BackQueue = new PriorityQueue<>(Collections.reverseOrder());
        t = Integer.parseInt(st.nextToken());
        for (int j = 0; j < t; j++) {
            int Icount=0;
            int Dcount=0;
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                char c = st.nextToken().charAt(0);
                if (c == 'I') {
                    Icount++;
                    int tmp = Integer.parseInt(st.nextToken());
                    FrontQueue.add(tmp);
                    BackQueue.add(tmp);
                } else {
                    if (FrontQueue.peek() != null) {
                        int tmp = Integer.parseInt(st.nextToken());
                        if (tmp == 1) {
                            BackQueue.poll();
                            Dcount++;
                        }
                        else {
                            FrontQueue.poll();
                            Dcount++;
                        }
                    }
                }
            }
            if (Icount <= Dcount) sb.append("EMPTY\n");
            else {
                sb.append(BackQueue.poll()).append(" ");
                sb.append(FrontQueue.poll()).append("\n");
            }
        }

        System.out.println(sb);


    }
}
