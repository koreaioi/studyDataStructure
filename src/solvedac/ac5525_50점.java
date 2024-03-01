package solvedac;
import java.util.*;

public class ac5525_50점 {
    static int n, m,count;

    //왜 틀린거지...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = sc.nextInt();
        m = sc.nextInt();
        String str = sc.next();
        ArrayList<Integer> al = new ArrayList<>(); //'I'의 index 위치를 저장
        for (int i = 0; i < m; i++) if(str.charAt(i) == 'I') al.add(i);
        count =0;

        for (int i = 0; i < al.size()-1; i++) {
            for (int j = i; j < al.size()-1; j++) {
                int n1 = al.get(j + 1);
                int n2 = al.get(i);
                int tmp = n1-n2;
                if(tmp % 2 !=0) break; //이게 없으면 IIOOI가 맞는 처리됨.
                if(tmp > 2 * n) break;
                else if(tmp == 2 * n && (j+1 - i) == n){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
