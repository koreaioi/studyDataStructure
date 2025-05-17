package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ac20006 {

    public static StringBuilder sb;
    public static List<Room> roomList;
    public static final int BOUND = 10;
    public static int P, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        roomList = new ArrayList<>();

        P = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            Player player = new Player(l, s);

            // 내 레벨에 맞는 방이 존재하는 지 확인
            // 없다면 방을 생성 후 roomList에 추가

            if(!canJoinRoom(player)) {
                Room room = new Room(player.level);
                room.addPlayer(player);
                roomList.add(room);
            }
        }

        for(Room room : roomList) {
            Collections.sort(room.list);
            if (room.isStarted()) {
                sb.append("Started!").append("\n");
            }else {
                sb.append("Waiting!").append("\n");
            }

            for(Player player : room.list) {
                sb.append(player.level).append(" ").append(player.nickname).append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    public static boolean canJoinRoom(Player player) {
        for(Room room : roomList) {
            if (!room.isStarted() && room.playerCanJoin(player)) {
                room.addPlayer(player);
                return true;
            }
        }

        return false;
    }

    public static class Room{
        int roomLevel;
        List<Player> list = new ArrayList<>();
        boolean status = false;

        public Room(int roomLevel) {
            this.roomLevel = roomLevel;
        }

        public boolean isStarted() {
            return status;
        }

        public boolean playerCanJoin(Player player) {
            if (roomLevel + 10 >= player.level && roomLevel - 10 <= player.level) {
                return true;
            }

            return false;
        }

        public void addPlayer(Player player) {
            list.add(player);
            if (list.size() == M) {
                status = true;
            }
        }
    }

    public static class Player implements Comparable<Player>{
        int level;
        String nickname;

        public Player(int level, String nickname){
            this.level = level;
            this.nickname = nickname;
        }

        @Override
        public int compareTo(Player o) {
            return nickname.compareTo(o.nickname);
        }
    }
}
