package Algorythm_String;

import java.util.Arrays;
import java.util.Scanner;

public class BinearSearch2 {

    static int binSearch(int[] x , int target, int low, int high){
         if(low > high) return -1;

        int mid = (low + high) / 2;

        if(x[mid] == target)
            return mid;
        else if(x[mid] < target )
            return binSearch(x, target, mid + 1, high);
        else
            return binSearch(x, target, low, mid - 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {15, 27, 39, 77, 92, 108, 121,};

        System.out.print("검색할 값: ");
        int target = scanner.nextInt();

        int index = binSearch(a, target, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
        System.out.println("a[" + index + "]에 있습니다.");

    }

    public static class String02 {
        public static String solution(String str){
         String answer = "";
         for(char x : str.toCharArray()){
             if(x >= 65 && x <= 90) answer += (char)(x + 32);
             else answer += (char)(x - 32);
         }
         return answer;
        } //solution method end


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            char[] c1  = s.toCharArray();
            System.out.println(c1);



            //System.out.print(solution(s));

        }
    }

    public static class String03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            //풀이에 필요한 변수
            String answer ="";
            int max = 0, pos;

            while((pos = str.indexOf(" ")) != -1){ // 첫번째 pos 초기화 2번째 while 조건식
                String tmp = str.substring(0, pos);
                if(tmp.length() > max) { //tmp의 길이가 그전의 최댓값 보다 크면
                    max = tmp.length();  //조건문 비교 대상 재정의
                    answer = tmp;        //answer 재정의
                }
                str = str.substring(pos + 1); //str 재 정의
            }
            if(str.length() > max ) answer = str;
            //while문을 탈출할 때 맨 마지막 단어는 대소비교를 하지 않으니 따로 추가해준 것.

            System.out.println(answer);
        }
    }
}
