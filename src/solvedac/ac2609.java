    package solvedac;

    import java.util.Scanner;

    public class ac2609 {
        public static int gcd(int a, int b) {
            int r =0;
            while (b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = 2; //최대 공약수
            int m = 0; //최소 공배수
            int r=0;
            int a = sc.nextInt();
            int b = sc.nextInt();

            r = gcd(a, b);
            System.out.println(r);
            System.out.println(a * b / r);
        }
    }
