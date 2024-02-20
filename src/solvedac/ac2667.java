package solvedac;

import java.util.*;

public class ac2667 {
    public static int[][] board, ch;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int n,count,num;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> al = new ArrayList<>();

    public static void solution() {
         num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1 && ch[i][j] ==0){// 1이면서 체크가 안되면 단지 탐색시작
                    count=0;
                    num++;
                    BFS(i, j); //BFS 시작 전에 단지수 +1, 단지내 집수를 0 으로 초기화
                }
            }
        }
    }

    public static void BFS( int x, int y) { //같은 아파트 단지 탐색 BFS
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        ch[x][y]=1; //맨처음 시작 값 방문표시
        count++;    //맨처음 단지내 집 +1

        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (0 <= nx && nx < n && 0 <= ny && ny < n && board[nx][ny] == 1 && ch[nx][ny] == 0) {
                    q.add(new Point(nx, ny));
                    ch[nx][ny] = 1; // 방문 표시
                    count++; //집 +1
                }
            }
        }
        al.add(count); //후에 정렬하므로 ArrayList에 저장(Collections.sort()사용)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        ch = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < n; j++) board[i][j] = str.charAt(j)-'0'; //int형으로 저장
        }

        solution();
        Collections.sort(al); //문제에서 오름차순 정렬하라고 했다.
        sb.append(num).append("\n");
        for (int x : al) sb.append(x).append("\n");

        System.out.println(sb); //출력
    }

    static class Point{
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
