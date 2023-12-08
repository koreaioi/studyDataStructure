package Algorythm_String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CardConv {



    public static void main(String[] args) {
        int[] prime = new int[500];
        int ptr = 0; //현재 어디까지 배열이 차있는지
        int counter = 0;


        prime[ptr++] = 2;
        prime[ptr++] = 3;
        //n 이 소수인지 아닌지를 판단하고자 하는 변수이다.
        for (int n = 5; n <= 1000; n+=2) { //짝수는 조사할 필요 없으니 홀수만 조사.
            boolean flag = false;
            int i;
            for (i = 1; prime[i] * prime[i] <= n; i++) {
                counter +=2;
                if(n % prime[i] == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                prime[ptr++] =n;
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }

    public static class ExComparator {

        public static final Comparator<String> STRING_ORDER = new StringOrderComparator();

        public static class StringOrderComparator implements Comparator<String> {
            public int compare(String s1, String s2){
                return (s1.compareTo(s2));
            }
        }


        public static void main(String[] args) {
            String[] strArr = {"cat", "Dog", "lion", "tiger"};

            Arrays.sort(strArr);
            System.out.println("strArr= " + Arrays.toString(strArr));

            Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
            System.out.println("strArr= " + Arrays.toString(strArr));

            Arrays.sort(strArr, STRING_ORDER);
            System.out.println("strArr= " + Arrays.toString(strArr));


        }

    }

    public static class String01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.next().toLowerCase();
            char ch = sc.next().charAt(0);
            int count = 0;

            char ch1 = Character.toLowerCase(ch);
            for (int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) == ch1)count++;
            }
            System.out.println(count);

        }
    }
}
