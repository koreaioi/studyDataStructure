package GreedyAlgorithm;

import java.util.*;

public class greedy_04_solution {
    public static int n,m,d;
    public static ArrayList<Lecture> al = new ArrayList<>();

    public static int solution(int max) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        int j =0;
        int sum = 0;
        for (int i = max; i > 0; i--) { //i는 날짜
            for (  ; j < n; j++) { //j 는 AL 순회하는 변수
                if(al.get(j).date < i){ //날짜가 바꼈으면 탈출
                    break;
                }
                PQ.offer(al.get(j).money);
            }
            if(!PQ.isEmpty()) sum += PQ.poll();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int max_date=0;
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            al.add(new Lecture(n1, n2));
            if(max_date < n2) max_date = n2;
        }

        Collections.sort(al);
        for (Lecture l : al) System.out.println(l.money + " " + l.date);

        System.out.println(solution(max_date));
    }

    static class Lecture implements Comparable<Lecture>{
        int money;
        int date;

        public Lecture(int money, int date) {
            this.money = money;
            this.date = date;
        }

        @Override
        public int compareTo(Lecture lecture) {
            return lecture.date - date;
        }

    }
}
