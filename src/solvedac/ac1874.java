package solvedac;
import java.util.*;

public class ac1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //수의 개수
        int[] arr = new int[n];
        for(int i = 0;i<n ;i++) arr[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        st.push(1);

        StringBuilder sb = new StringBuilder();
        sb.append("+\n");


        int num=2;
        int index=0;
        while(index < n){
            if(st.isEmpty() || st.peek() != arr[index]){ //스택 윗부분과 배열 값이 같으면 스택에서 꺼낸다.
                st.push(num);
                num++;
                sb.append("+\n");
            }else{
                index++;
                st.pop();
                sb.append("-\n");
            }
            if(num > n+1){
                sb = new StringBuilder("NO");
                break;
            }
        }
        System.out.println(sb.toString());
    }

}



