package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ac7662 {
    //우선 순위 큐 기본은 가장 작은 값
    static int t, k;

    static PriorityQueue<Integer> BackQueue = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> FrontQueue = new PriorityQueue<>();
    static HashMap<Integer, Integer> hm = new HashMap<>();

    //이 메서드는 무조건 delete함
    public static int DeleteToMap(PriorityQueue<Integer> que){
        int num=0;
        while(true){
            num = que.poll();
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(st.nextToken());
        for (int j = 0; j < t; j++) {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());

            for (int i = 0; i < k; i++) { //'I', 'D' 연산 시작
                st = new StringTokenizer(br.readLine());
                char c = st.nextToken().charAt(0);
                if (c == 'I') {
                    int tmp = Integer.parseInt(st.nextToken());
                    FrontQueue.add(tmp);
                    BackQueue.add(tmp);
                    hm.put(tmp, hm.getOrDefault(tmp,0) + 1);
                } // 'I' 에서 삽입하는 과정
                else { //'D'일 경우
                    if (hm.size()!=0) { //HashMap에 값이 있을 때 뺀다.
                        int tmp = Integer.parseInt(st.nextToken());
                        if (tmp == 1) {
                            DeleteToMap(BackQueue);
                        }
                        else {
                            DeleteToMap(FrontQueue);
                        }
                    }
                }
            } //'I', 'D' 연산 종료

            if (hm.size() == 0) sb.append("EMPTY\n");
            else {
                int n = DeleteToMap(BackQueue);
                sb.append(n).append(" ");
                sb.append(hm.size() > 0 ? DeleteToMap(FrontQueue) : n).append("\n");
            }
        }
        System.out.println(sb);

    }
}
