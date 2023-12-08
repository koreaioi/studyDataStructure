/*
package BFS_DFS;
import java.util.*;

class Node{

    int data;
    Node lt;
    Node rt;

    Node(int value) {
        this.data = value;
    }
}

public class bfs07 {
    static Node root;

    public static void BFS(Node root) { //bfs로 root를 순회
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node next = q.poll();
                System.out.print(next.data +" ");
                if(next.lt!=null) q.offer(next.lt);
                if(next.rt!=null) q.offer(next.rt);
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        BFS(root);


    }
}
*/
