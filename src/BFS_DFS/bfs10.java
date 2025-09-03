//package BFS_DFS;
//import java.util.*;
//
//
//class Node {
//    int data;
//    Node1 lt, rt;
//
//    Node(int value) {
//        this.data = value;
//    }
//
//}
//
//public class bfs10 {
//    static Node1 root;
//
//    public static int BFS(int L, Node1 root) {
//        Queue<Node1> q = new LinkedList<>();
//        q.offer(root);
//
//        while (!q.isEmpty()) {
//            int len = q.size();
//            for (int i = 0; i < len; i++) {
//                Node1 tmp = q.poll();
//                if(tmp.lt ==null && tmp.rt ==null) return L ;
//                if(tmp.lt != null) q.offer(tmp.lt);
//                if(tmp.rt != null) q.offer(tmp.rt);
//                }
//            L++;
//
//        }
//
//
//
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        root = new Node1(1);
//        root.lt = new Node1(2);
//        root.rt = new Node1(3);
//        root.lt.lt = new Node1(4);
//        root.lt.rt = new Node1(5);
//
//        System.out.println(BFS(0,root));
//    }
//}
