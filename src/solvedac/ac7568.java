package solvedac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    int weight;
    int height;
    int rate;
    Person(int weight, int height, int rate) {
        this.weight = weight;
        this.height = height;
        this.rate = rate;

    }
}

public class ac7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];

        for(int i = 0;i<n;i++){
            int tmp1 = sc.nextInt();
            int tmp2 = sc.nextInt();
            people[i] = new Person(tmp1, tmp2,0);
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if(i==j) continue; //자기 자신과 비교는 패스
                if (people[i].height < people[j].height && people[i].weight < people[j].weight) {
                    count++;
                }
            }
            people[i].rate = count;
        }
        for (Person p : people) {
            System.out.print(p.rate + " ");
        }



    }
}
