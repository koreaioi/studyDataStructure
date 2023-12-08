import java.util.Scanner;

public class PhysicalExamination {

    static final int VMAX = 21; //시력 분포 (0.0 ~ 0.1 단위로 21개)

    static class PhyscData{
        String name;
        int height;
        double vision;
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }


    static double aveHeight(PhyscData[] data){    //키의 평균을 구함
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i].height;
        }
        return sum / data.length;
    }

    static void distVision(PhyscData[] data, int[] dist) { //시력 분포를 구함
        int i =0;
        dist[i] = 0;

        for (i = 0; i < data.length; i++) {
            if(data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0){ //시력이 0.0과 2.1 사이면
                dist[(int)(data[i].vision * 10)]++;
                // 시력 0.3 이면 dist의 3번째 배열에 플러스 1
            }
        }

    }

    static String printstar(int a){
        String str ="";
        for (int i = 0; i < a; i++) {
            str += "*";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vdist = new int[VMAX];

        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8),
        };
        System.out.println("  신체 검사 리스트  ");
        System.out.println("이름      키      시력");
        System.out.println("--------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-7s%-6d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n평균 키: %5.1fcm\n", aveHeight(x));
        distVision(x, vdist);  //vdist에는 분포에 따른 학생 수가 적혀있음

        for(int i = 0; i< VMAX ;i++){
            System.out.println((double)( i/ 10.0)+ " ~: " + printstar(vdist[i]));
        }



    }
}
