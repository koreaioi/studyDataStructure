package DFS_BFS_levelup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dfs_14_myself {
    public static int n, m, sum;
    public static int[] dis, ch;
    public static House[] house;
    public static Pizza[] pizza;
    public static int answer = Integer.MAX_VALUE;

    public static void DFS(int L, int s) {
        if (L == m) {
            Arrays.fill(dis, Integer.MAX_VALUE); //계산하기 전에 dis를 초기화 해줘야한다.
            calc();
            answer = Math.min(answer, Arrays.stream(dis).sum());
        } else {
            for (int i = s; i < pizza.length; i++) { //조합 구하기 복습해야함.
                ch[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void calc() {
        for (int i = 0; i < m; i++) {
            Pizza tmp = pizza[ch[i]];
            for (int j = 0; j < house.length; j++) {
                dis[j]= Math.min(dis[j],Math.abs(tmp.x - house[j].x) + Math.abs(tmp.y - house[j].y));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<House> al1 = new ArrayList<>();
        ArrayList<Pizza> al2 = new ArrayList<>();
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) al1.add(new House(i, j));
                else if (tmp == 2) al2.add(new Pizza(i, j));
            }
        }
        house = new House[al1.size()];
        for (int i = 0; i < al1.size(); i++) house[i] = al1.get(i);
        pizza = new Pizza[al2.size()];
        for (int i = 0; i < al2.size(); i++) pizza[i] = al2.get(i);

        dis = new int[house.length];
        Arrays.fill(dis, Integer.MAX_VALUE);
        ch = new int[m];

        DFS(0, 0);
        System.out.println(answer);
    }


    static class Pizza {
        int x, y;

        public Pizza(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    ;

    static class House {
        int x, y;

        public House(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

