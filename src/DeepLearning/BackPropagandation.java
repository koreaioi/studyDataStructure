package DeepLearning;

import java.util.ArrayList;
import java.util.Random;

public class BackPropagandation {

    static ArrayList<Node[]> al = new ArrayList<>();
    static Node[] node0 = new Node[2]; // 입력 층
    static Node[] node1 = new Node[3]; // 은닉 1층
    static Node[] node2 = new Node[2]; // 은닉 2층
    static Node[] node3 = new Node[1]; // 출력 층

    static double t = 1.0; //정답
    static double error; // 오차
    static double lr = 0.8; // 학습률(Learning rate) 0.5로 설정



    public static void main(String[] args) {
        System.out.println(" === XOR 딥러닝 입력 값 0, 1 === ");
        //가중치 배열
        //입력이 0,1 일 경우 1이 나올 수 있도록 신경망 학습
        initialize(); //노드 초기화

        //전방향 학습
        learning();
        //출력
        printNodeBothInOut();
        //역전파
        backPropagandation();
//        //가중치 0계층 수정
//        System.out.println("0계층 가중치 수정 전");
//        printWeight(0);
//        updateWeight(0); //가중치 수정
//        System.out.println("0계층 가중치 수정 후");
//        printWeight(0);
//
//        System.out.println("======================");
//
//
//        System.out.println("1계층 가중치 수정 전");
//        printWeight(1);
//        updateWeight(1 ); //가중치 수정
//        System.out.println("1계층 가중치 수정 후");
//        printWeight(1);
//        System.out.println("======================");
//
//        System.out.println("2계층 가중치 수정 전");
//        printWeight(2);
//        updateWeight(2 ); //가중치 수정
//        System.out.println("2계층 가중치 수정 후");
//        printWeight(2);

        //전방향 학습
        learning();
        //출력
        printNodeBothInOut();

    }

    static class Node{
        double input; // 입력 값
        double output;// 출력 값
        double[] weightOut; // 현재 노드에서 다음 노드로의 가중치 값
        double sigmode; //내 노드에서 출력값을 보낼 때 사용하는 활성화 함수
        double delta;   //델타

        public Node() {

        }

        public Node(double output) {
            this.output = output;
        }

        public void sigMode(double output) { //시그모이드 계산
            this.sigmode = 1 / (1 + Math.exp(-1 * output));
        }

        public double differential(double y) { //미분 함수, y에 시그모이드 값을 넣는다.
            return y * (1-y);
        }
    }


    public static void initialize() {
        node0[0] = new Node(0.0);
        node0[1] = new Node(1.0);
        node1[0] = new Node();
        node1[1] = new Node();
        node1[2] = new Node();
        node2[0] = new Node();
        node2[1] = new Node();
        node3[0] = new Node();
        al.add(node0);
        al.add(node1);
        al.add(node2);
        al.add(node3);
        initNode(0);
        initNode(1);
        initNode(2);
    }

    public static void learning() {
        summingJunction(1);
        summingJunction(2);
        summingJunction(3);
    }

    public static void backPropagandation(){
        //델타 수정
        calDelta(2);
        calDelta(1);
        // 가중치 수정
        updateWeight(0);
        updateWeight(1);
        updateWeight(2);
    }

    public static void initNode(int layer) {
        Random rd = new Random(10);
        for (Node n : al.get(layer)) {
            int size = al.get(layer + 1).length;
            n.weightOut = new double[size]; //보내는 가중치는 다음 계층의 노드 수
            for(int i = 0 ; i< size;i++){
                n.weightOut[i] = rd.nextDouble();
            }
        }
    }

    //전방향 신경망 알고리즘
    public static void summingJunction(int layer) {
        Node[] tmp = al.get(layer-1);
        int size = al.get(layer-1).length;
        double sum=0;

        for(int i =0;i<al.get(layer).length;i++){ //layer층 의 노드들에게 오는 가중치 합 계산
            for (int j = 0; j < size; j++) {
                //각 노드들의 i번째 가중치 와 입력값을 더해야한다.
                sum += tmp[j].weightOut[i] * tmp[j].output;
            }
            //현재 layer층의 노드에 가중치 * 입력값(sum)을 input에 저장.
            //현재 layer층의 노드에 활성값(output) 저장.
            Node tmp_nd = al.get(layer)[i];
            tmp_nd.input = sum;
            tmp_nd.sigMode(sum);
            tmp_nd.output = tmp_nd.sigmode;
        }
    }

    //가중치 갱신을 위해 델타 값을 만들어준다.
    public static void calDelta(int layer){ //layer 층에 있는 노드들의 델타 값을 구한다.
        //if layer ==2
        // 델타 = 현재 노드의 미분값 * 다음 계층 노드의 가중치 * 다음 노드의 델타
        //현재 노드의 가중치 개수 = 다음 계층 노드 개수 --> 이를 i 변수 선언
        for (int i = 0; i < al.get(layer + 1).length; i++) {
            //현재 계층의 노드의 개수
            for (int j = 0; j < al.get(layer).length; j++) {
                Node tmp = al.get(layer)[j];
                double dif = tmp.differential(tmp.sigmode); //현재 노드의 미분값
                tmp.delta = tmp.weightOut[i] * al.get(layer+1)[i].delta * dif;
            }
        }
    }

    //델타로 가중치를 갱신한다.
    public static void updateWeight(int layer) {
        Node[] nodes = al.get(layer);
        Node[] nextNodes = al.get(layer + 1);

        for (int i = 0; i < nodes.length; i++) {
            double[] tmpWeight = nodes[i].weightOut;
            for (int j = 0; j < nextNodes.length; j++) {
                nodes[i].weightOut[j] = tmpWeight[j] + (lr * nodes[i].output * nextNodes[j].delta);
            }
        }
    }


    //input을 가중치 합산하여 활성화 함수로 변환하는 과정을 출력
    public static void printNodeBothInOut() {
        System.out.println(" \t\t\t\t=== 입력 층 데이터 출력 과정 === ");
        for (int i = 0; i < al.get(0).length; i++) {
            System.out.print("노드 " + i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 2; i++) {
            Node[] tmp = al.get(i);
            System.out.println(" \t\t\t\t=== 은닉 " + i + " 층 변환 과정 출력 === ");
            for (Node x : tmp) {
                System.out.println(x.input + " --- 활성화 함수를 거쳐 ---> " + x.output + "으로 변환");
            }
        }

        System.out.println(" \t\t\t\t=== 출력 층 변환 과정 출력 ===");
        Node x = al.get(3)[0];
        System.out.println(x.input + " --- 활성화 함수를 거쳐 ---> " + x.output +"으로 변환");
        System.out.println("오차는 (t - 출력 층의 output) 이므로");
        error = t - x.output;
        System.out.println("오차는 (" + t + " - " + x.output + " )=  \"" + error + "\" 입니다." );
        x.delta = error * x.differential(x.sigmode);
        System.out.println("오차 신호(delta)는 " + x.delta + "입니다.");
    }


    //가중치만 보여주는 함수, 갱신이 잘 되었는지 확인
    public static void printWeight(int layer) {
        for (Node x : al.get(layer)) {
            for (double v : x.weightOut) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }


}
