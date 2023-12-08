package Algorythm_String;

import java.util.Arrays;
import java.util.Scanner;

public class BinearSearch3 {

    static int binearSearch(int[] x, int target){
        int low = 0;
        int high = x.length;
        int front;

        while(low < high){
            int mid = (low + high) / 2;
            if(x[mid]==target) return mid;
            else if(x[mid] < target) low = mid + 1;
            else high = mid - 1;
        }


        return -1;
    }

    static int frontSearch(int[] x, int target, int m){
        int index = -1;
        for(int i=m ; i >= 0 ; i--){
            if(x[i] == target) index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요소 수: ");
        int num = scanner.nextInt();

        int x[] = new int[num];
        int y[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }
        System.out.print("검색 값: ");
        int target = scanner.nextInt();

        binearSearch(x, target);
        System.out.println("중앙값은 " + binearSearch(x, target) + "에 있습니다.");
        System.out.println("값과 일치하는 배열은 x[" + frontSearch(x, target, binearSearch(x, target)) + "]에 있습니다");

    }

}
