package BFS_DFS;
import java.util.*;


class Node {
    int data;
    Node lt, rt;

    Node(int value) {
        this.data = value;
    }

}

public class bfs10 {
    static Node root;

    public static int BFS(int L,Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node tmp = q.poll();
                if(tmp.lt ==null && tmp.rt ==null) return L ;
                if(tmp.lt != null) q.offer(tmp.lt);
                if(tmp.rt != null) q.offer(tmp.rt);
                }
            L++;

        }



        return 0;
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(BFS(0,root));
    }
}
