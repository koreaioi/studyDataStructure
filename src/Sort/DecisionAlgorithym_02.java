package Sort;
import java.util.*;

public class DecisionAlgorithym_02 {
    public static int possible(int[] arr, int mid) {
        //최대 거리를 mid라 가정했을 때 배치한 말의 개수를 반환해주는 메서드
        //arr[i] - endPoint 가 mid 보다 짧으면 안됨.
        //mid는 가장 가까운 말끼리의 최대 거리이므로.
        int count =1;
        int endPoint =arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - endPoint >= mid){
                endPoint = arr[i];
                count++;
            }
        }
        return count;
    }

    public static int solution(int[] arr, int n, int c) {
        int answer =0;
        //최대 거리를 추론해나가는 과정에서 lt와 rt는 최대 거리의 범위이기때문에
        //lt는 1로 rt는 arr의 정렬 후 마지막 값으로 정해야한다.
        int lt = 1;
        int rt = arr[n-1]; //정렬 후 마지막 값

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            //c는 배치하고픈 말의 수
            if(possible(arr, mid) >= c){//가정했을 때 말의 수가 c 보다 많거나 같으면
                // 최대 거리를 너무 짧게 설정했거나,일단 답으로 저장하고 더 나은 최대 거리가 있을 수 있으므로  최대 거리를 늘린다.
                answer = mid;
                lt = mid+1;
            }else{
                //가정했을 때 말의 수가 c 보다 작으면 최대 거리를 너무 길게 설정했다는 뜻이므로 최대 거리를 줄여야한다.
                rt = mid-1;
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //마굿간의 수
        int c = sc.nextInt(); //배치할 말의 수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); //arr을 정렬해야함.

        System.out.println(solution(arr, n, c));

    }
}
