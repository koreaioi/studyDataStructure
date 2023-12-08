package Sort;

import java.util.*;

class Point1{
    public int x, y;

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Sort_07_Comparator {
    static Comparator<Point1> comp = new Comparator<Point1>() {
        @Override
        public int compare(Point1 o1, Point1 o2) {
            if(o1.x == o2.x) return o1.y - o2.y;
            else return o1.x - o2.x;
        }
    };
    Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point1> arr = new ArrayList<Point1>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point1(x, y));
        }
        Collections.sort(arr, comp);
        for (Point1 p : arr) {
            System.out.print(p.x + " " + p.y +"\n");
        }


    }
}