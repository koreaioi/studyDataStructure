package Algorithm_class;

import java.util.Scanner;

public class Knapsack {
    static int maxWeight;
    static int[] weights;
    static int[] values;
    static int n; // 물건의 개수
    static int maxProfit = 0; // 최대 이익
    static int[] bestItems; // 최대 이익을 위한 아이템들의 인덱스 배열
    static int[] currentItems; // 현재 선택된 아이템들을 나타내는 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = sc.nextInt();
        maxWeight = sc.nextInt();
        weights = new int[n];
        values = new int[n];
        for (int i = 0; i < n; i++) weights[i] = sc.nextInt();
        for (int i = 0; i < n; i++) values[i] = sc.nextInt();

        bestItems = new int[n];
        currentItems = new int[n];

        knapsack(0, 0, 0, 0);

        sb.append("Optimal solution: ");
        for (int x : bestItems) sb.append(x + " ");
        sb.append("\n").append("Maximum profit: ").append(maxProfit);

        System.out.println(sb);
    }

    static void knapsack(int i, int currentWeight, int currentProfit, int itemCount) {
        if (i == n) {
            if (currentWeight <= maxWeight && currentProfit > maxProfit) {
                maxProfit = currentProfit;
                System.arraycopy(currentItems, 0, bestItems, 0, n);
            }
            return;
        }

        if (promising(i, currentWeight, currentProfit)) {
            // i번째 아이템을 선택하지 않는 경우
            currentItems[i] = 0;
            knapsack(i + 1, currentWeight, currentProfit, itemCount);

            // i번째 아이템을 선택하는 경우
//            if (currentWeight + weights[i] <= maxWeight) {
            currentItems[i] = 1;
            knapsack(i + 1, currentWeight + weights[i], currentProfit + values[i], itemCount + 1);
//            currentItems[i] = 0;
//          }
        }
    }

    static boolean promising(int i, int currentWeight, int currentProfit) {
        if (currentWeight > maxWeight) return false;

        int bound = currentProfit;
        int totalWeight = currentWeight;
        int k = i;

        while (k < n && totalWeight + weights[k] <= maxWeight) {
            totalWeight += weights[k];
            bound += values[k];
            k++;
        }

        if (k < n) {
            bound += (maxWeight - totalWeight) * values[k] / weights[k];
        }

        return bound > maxProfit;
    }
}


