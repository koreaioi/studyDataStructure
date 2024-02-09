package solvedac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ac1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<String> al = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            hm.put(tmp, hm.getOrDefault(tmp, 0) + 1);
        }

        for (String tmp : hm.keySet()) {
            if(1 < hm.get(tmp)) al.add(tmp);
        }
        Collections.sort(al);
        System.out.println(al.size());
        for(String tmp : al) System.out.println(tmp);
    }
}
