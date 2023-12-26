package solvedac;


import java.util.Arrays;
import java.util.Scanner;

public class ac10814 {
    static class Person implements Comparable<Person> {
        int age;
        String name;
        int order;

        Person(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }

        @Override
        public int compareTo(Person o) {
            if(this.age == o.age) return this.order - o.order;
            else return this.age - o.age;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        Person[] person = new Person[n];

        for (int i = 0; i < n; i++) {
            person[i] = new Person(sc.nextInt(), sc.next(),i);
        }
        Arrays.sort(person);

        for (Person p : person) sb.append(p.age).append(" ").append(p.name).append("\n");
        System.out.println(sb);


    }
}
