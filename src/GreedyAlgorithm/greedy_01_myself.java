package GreedyAlgorithm;
import java.util.*;

public class greedy_01_myself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] p = new Person[n];
        int count=0;

        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            p[i] = new Person(n1, n2);
        }
        Arrays.sort(p);

        for (int i = 0; i < n; i++) { //한명씩 키순
            int tmp = p[i].weight;
            boolean flag = true;
            for (int j = i+1; j < n; j++) {
                if(tmp < p[j].weight){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        System.out.println(count);

    }

    static class Person implements Comparable<Person>{
        int height, weight;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }


        @Override
        public int compareTo(Person o) {
            return this.height - o.height;
        }
    }
}


