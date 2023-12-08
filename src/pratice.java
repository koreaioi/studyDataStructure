import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class pratice {

    static int sumOf(int[] a) {
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            sum = a[i];
        }
        return sum;
    }

    static void print(int[] a) {
        System.out.print("{");
        for (int i = 0; i < a.length -1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length-1] + "}");
    }

    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[b.length -i-1];
        }
        System.out.println("복사 완료");
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int a[], b[];
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 요소수: ");
        int num = sc.nextInt();
        a = new int[num];
        b = new int[num];

        for (int i = 0; i < b.length; i++) {
            b[i] = rd.nextInt(100);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
        System.out.print("배열 b =");
        print(b);
        System.out.print("배열 a =");
        print(a);
        rcopy(a, b);
        System.out.print("배열 a =");
        print(a);
       /* System.out.println("배열의 합 = " + sumOf(b));
        System.out.println(Arrays.toString(a));*/
    }
}
