package solvedac;
import java.util.*;




public class ac1018 {
    public static char[][] tmp;
    static char[][] black = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
    };
    static char[][] white = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
    };

    public static int compare_black(int i, int j){
        int count=0;
        int tmpi =0;
        for (int column = i; column < i + 8; column++) {
            int tmpj=0;
            for (int row = j; row < j + 8; row++) {
                if(tmp[column][row]!=black[tmpi][tmpj])count++;
                tmpj++;
            }
            tmpi++;
        }

        return count;
    }

    public static int compare_white(int i, int j){
        int count=0;
        int tmpi =0;

        for (int column = i; column < i + 8; column++) {
            int tmpj=0;
            for (int row = j; row < j + 8; row++) {
                if(tmp[column][row]!=white[tmpi][tmpj])count++;
                tmpj++;
            }
            tmpi++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //세로
        int m = sc.nextInt(); //가로
        tmp = new char[n][m];

        int answer=65;

        String str = new String();
        for (int i = 0; i < n; i++) {
            str = sc.next();
            tmp[i]=str.toCharArray();
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                answer = Math.min(answer, compare_white(i,j));
                answer = Math.min(answer, compare_black(i, j));
            }
        }
        System.out.println(answer);



    }
}
