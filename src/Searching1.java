import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Searching1 {

    static int seqSearch(int[] a, int key){ //검색할 값을 지닌 배열의 인덱스를 반환
        a[a.length-1] = key ; //마지막 요소에 찾고자하는 값을 추가
        int i = 0 ; //while 문이 끝나고 인덱스를 나타내는 i가 사라지지 않게 while 밖에서 변수 초기화
        while(true){
            if(key == a[i]) break;
            i++;
        }
        return i == a.length-1  ? -1 : i; //인덱스가 마지막 인덱스이면 -1, 그렇지 않으면 i 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num+1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int s = sc.nextInt();
        System.out.println("그 값은 x[" + seqSearch(x, s) + "] 에 있습니다.");
        System.out.println(Arrays.toString(x));






    }
}
