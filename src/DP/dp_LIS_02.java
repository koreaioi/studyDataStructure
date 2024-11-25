package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dp_LIS_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        Brick[] bricks = new Brick[n];
        int[] dp = new int[n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int bottom = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            bricks[i] = new Brick(bottom, height, weight);
        }
        Arrays.sort(bricks);

        dp[0] = bricks[0].height;
        int maxHeight = 0;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if(bricks[i].weight < bricks[j].weight){
                    if (max < dp[j]) {
                        max = dp[j];
                    }
                }
                dp[i] = max+bricks[i].height;
                maxHeight = Math.max(maxHeight, dp[i]);
            }
        }
        System.out.println(maxHeight);


    }

    static class Brick implements Comparable<Brick> {
        int bottom;
        int height;
        int weight;
        Brick(int bottom, int height, int weight) {
            this.bottom = bottom;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Brick o) {
            return o.bottom - this.bottom ;
        }

        @Override
        public String toString(){
            return this.bottom + " " + this.height + " " + this.weight;
        }
    }
}
