package solvedac;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Document{
    int name;
    int importance;

    public Document(int name, int importance) {
        this.name = name;
        this.importance = importance;
    }
}

public class ac1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int j =0; j<t;j++) {
            int n = sc.nextInt(); //문서 수
            int m = sc.nextInt(); //언제 나올 지 궁금한 문서
            int[] arr = new int[n]; //중요도만 담은 배열
            int index = n - 1; //arr.length - 1 에서 점점 -- 해간다. (중요도 역순)
            int count = 0;//몇 번째로 나왔는지 count
            Queue<Document> q = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                arr[i] = tmp;
                q.add(new Document(i, tmp));
            }//큐와 배열에 값 세팅

            Arrays.sort(arr);//arr을 중요도를 오름차순로 정렬

            while (!q.isEmpty()) {
                int max = arr[index];
                Document d = q.poll();
                if (d.importance == max) {
                    index--;
                    count++;
                    if (d.name == m) {
                        sb.append(count).append('\n');
                        break;
                    }
                } else q.add(d);
            }
        }
        System.out.println(sb);
    }
}
