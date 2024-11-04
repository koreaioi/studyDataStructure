package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ac13305 {

    static int n;
    static Long[] distance;
    static Long[] oil;
    static Long sum=0L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 도시 수
        distance = new Long[n]; // 인덱스 0은 사용 X e[1] 은 0->1로 가는 비용
        oil = new Long[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n-1; i++) distance[i] = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) oil[i] = Long.parseLong(st.nextToken());
        setCheapOil();
//        for (int i = 0; i < n - 1; i++) {
//            sum += e[i] * oil[i];
//        }
        if(n==1){
            sum = distance[0] * oil[0];
        }
        System.out.println(sum);


    }

    public static void setCheapOil(){
        Long cheapOil = oil[0];
        for (int i = 0; i < n-1; i++) {
            if(cheapOil <= oil[i]){
                oil[i] = cheapOil;
            }else{ // 기름값이 더 큰 도시일 경우
                cheapOil = oil[i];
            }
            sum += cheapOil * distance[i];
        }
    }


}
