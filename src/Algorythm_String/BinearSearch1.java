package Algorythm_String;

import java.util.Scanner;

public class BinearSearch1 {

    static int binSearch(int[] a, int target) {
        int low = 0;
        int high = a.length-1;

        while (low < high) {
            int mid = (low + high) / 2;
            if(a[mid] == target) return mid;
            else if(a[mid] < target) low = mid +1;
            else high = mid -1;
        }
        return -1;

    }

    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름 차순으로 입력하세요.");
        for (int i = 0; i < num /*x.length*/; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값");
        int target = sc.nextInt();

        int index = binSearch(x, target);
        System.out.println("그 값은 x[" + index + "]에 있습니다.");


    }
}
