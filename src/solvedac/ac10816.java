package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ac10816 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            HM.put(tmp, HM.getOrDefault(tmp, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<m;i++){
            int tmp = Integer.parseInt(st.nextToken());
            int num=0;
            if(HM.get(tmp)==null) sb.append(0).append(" ");
            else {
                num = HM.get(tmp);
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb);


    }
}

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> HM = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            HM.put(tmp, HM.getOrDefault(tmp, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();

        int m = sc.nextInt();
        for(int i = 0;i<m;i++){
            int tmp = sc.nextInt();
            int num=0;
            if(HM.get(tmp)==null) sb.append(0).append(" ");
            else {
                num = HM.get(tmp);
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb);


    }*/
