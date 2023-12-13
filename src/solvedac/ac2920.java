package solvedac;
import java.util.*;



public class ac2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) arr[i] = sc.nextInt();
        String answer = "";
        if(arr[0] == 1){//ascending인지 확인
            answer = "ascending";
            for(int i = 0 ; i < 8;i++){
                if(arr[i] != i + 1){
                    answer = "mixed";
                    break;
                }
            }
        } else if (arr[0] == 8) { //decending인지 확인
            answer = "descending";
            for(int i = 0 ; i < 8;i++){
                if(arr[i] != 8-i){
                    answer = "mixed";
                    break;
                }
            }
        }else{
            answer = "mixed";
        }
        System.out.println(answer);
    }

}
