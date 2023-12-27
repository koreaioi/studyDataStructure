package solvedac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class ac11650 {
    static class Point{
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        Point[] point = new Point[n];
        Comparator<Point> comp = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.x == o2.x) return o1.y - o2.y;
                else return o1.x - o2.x;
            }
        };

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            point[i] = new Point(x, y);
        }
        Arrays.sort(point, comp);
        for (Point p : point) sb.append(p.x).append(" ").append(p.y).append("\n");
        System.out.println(sb);
    }
}
