package Sort;
import java.util.*;

class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    //양수 반환시 교환., 음수 반환시 교환하지 않는다.
    public int compareTo(Point point) {
        if(this.x == point.x) return this.y - point.y;
        else return this.x - point.x;
    }

}

public class Sort_07_solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<Point>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point p : arr) {
            System.out.println(p.x + " " +p.y);
        } System.out.println();
    }
}
