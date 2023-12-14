    package solvedac;

    import java.util.Scanner;

    public class ac2609 {
        public static int gcd(int a, int b) {
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int r = gcd(a, b);
            System.out.println(r);
            System.out.println(a * b / r);
        }
    }
