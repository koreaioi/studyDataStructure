package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ac7662 {
    //우선 순위 큐 기본은 가장 작은 값
    static int t, k;

    static PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minQueue = new PriorityQueue<>();
    static Map<Integer, Integer> hm = new HashMap<>();

    //이 메서드는 무조건 delete함
    public static int DeleteToMap(Queue<Integer> q){
        int num=0;
        while(true){
            num = q.poll();
            int count = hm.getOrDefault(num,0);
            if(count == 0) continue; //FQ에는 있지만 BQ가 삭제했을 경우 또는 그 반대

            if( count == 1) hm.remove(num);
            else hm.put(num, count - 1);

            break;
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());
        for (int j = 0; j < t; j++) {
            k = Integer.parseInt(br.readLine());

            for (int i = 0; i < k; i++) { //'I', 'D' 연산 시작
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                if (s.equals("I")) {
                    int tmp = Integer.parseInt(st.nextToken());
                    maxQueue.add(tmp);
                    minQueue.add(tmp);
                    hm.put(tmp, hm.getOrDefault(tmp,0) + 1);
                } // 'I' 에서 삽입하는 과정
                else { //'D'일 경우
                    int tmp = Integer.parseInt(st.nextToken());

                    if(hm.size()==0) continue;
                    if (tmp == 1) DeleteToMap(maxQueue);
                    else DeleteToMap(minQueue);
                }
            } //'I', 'D' 연산 종료

            if (hm.size() == 0) sb.append("EMPTY\n");
            else {
                int n = DeleteToMap(maxQueue);
                sb.append(n).append(" ");
                if(hm.size()>0) n = DeleteToMap(minQueue);
                sb.append(n + "\n");

            }
        }
        System.out.println(sb.toString());

    }
}
