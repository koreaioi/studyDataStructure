package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ac18258 {

    /*
    * 명령어
    * 1. front, back (맨 앞, 뒤 출력한다. 없으면 -1)
    * 2. size (큐 사이즈)
    * 3. emtpy (비어 있으면 1, 아니면 0)
    * 4. pop (큐 앞에 있는 정수 제외, 큐가 비어있으면 -1)
    * 5. push X: 정수 X를 큐에 넣는 연산
    * */

    public static int[] q = new int[2000000];
    public static int index, front, size =0;
    public static StringBuilder sb = new StringBuilder();

//    public static List<String> command;



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        // push X 때문에 한줄을 String으로 입력 받음.
        for(int i = 0; i<n;i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
                case "empty":
                    empty();
                    break;
                case "size":
                    size();
                    break;
                case "pop" :
                    pop();
                    break;
            }
        }

        System.out.println(sb);
    }

    // front - 맨 앞의 값 출력
    public static void front() {
        if(size == 0) sb.append(-1).append("\n");
        else sb.append(q[front]).append("\n");
    }

    // back - 맨 뒤의 값 출력
    public static void back() {
        if(size == 0) sb.append(-1).append("\n");
        else sb.append(q[index - 1]).append("\n");
    }

    // empty - 큐가 비어있으면 1, 아니면 0
    public static void empty(){
        if(size ==0 ) sb.append(1).append("\n");
        else sb.append(0).append("\n");
    }

    public static void size(){
        sb.append(size).append("\n");
    }

    public static void pop(){
        if(size == 0){
            sb.append(-1).append("\n");
        }else{
            sb.append(q[front]).append("\n");
            front++;
            size--;
        }
    }

    public static void push(int  num) {
        q[index] = num;
        index++;
        size++;
    }

}
