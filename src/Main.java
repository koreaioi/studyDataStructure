import java.util.*;

public class Main {
    public static int solution(int n) {
        int answer = 1;

        if (n % 4 == 0) { //4의 배수일때
            if(n%100 ==0 && n%400 != 0) {
                answer =0;
                //100의 배수 일때 400의 배수 x -> 윤년 아님
                //100의 배수 일때 400의 배수 o -> 윤년
            }
        } else { //4의 배수가 아니면 윤년 아님
            return 0;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));

    }
}
