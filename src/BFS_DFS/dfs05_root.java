/*
package BFS_DFS;
import java.util.*;

class Node{
    int data;
    Node lt, rt;

    public Node(int value) {
            this.data = value;
        lt = rt = null;
    }

}


public class dfs05_root {
    public static Node root; //root 노드 생성

    public static void DFS(Node root) {
        if(root == null) return;
        else{
            DFS(root.lt);
            DFS(root.rt);
            System.out.print(root.data + "  "); //부모노드의 값 출력

        }

    }

    //부모 왼쪽 오른쪽 중에서 부모 노드가 전 중 후로 출력됨에 따라서 전위 중위 후위로 결정된다.

    public static void main(String[] args) {
        dfs05_root tree = new dfs05_root();
        root = new Node(1); //root 노드에 data 1 저장
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);

        DFS(root);



    }


}
*/
