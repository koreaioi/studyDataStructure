import java.util.Arrays;
import java.util.Comparator;

public class ExComparable {

    public static void main(String[] args) {
        Student[] objArr = new Student[10];

        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = new Student((int)(Math.random()*100));
        }

        System.out.print("정렬 전 ");
        for (Student a : objArr) {
            System.out.print(a.age);
            System.out.print(", ");
        }

        Student comp = new Student(0);
        Arrays.sort(objArr, comp1);

        System.out.print("\n정렬 후 ");
        for (Student a : objArr) {
            System.out.print(a.age);
            System.out.print(", ");
        }


    }

    public static Comparator<Student> comp1 = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.age - o1.age;
        }
    };


   /* public static Comparator<Student> comp1 = new Comparator<Student>() {
        public int compare(Student o1, Student o2){
            return o1.classNumber - o2.classNumber;
        }
    };

    public static Comparator<Student> comp2 = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }
    };*/

}

class Student implements Comparator<Student>{
    int age;
    Student(int age){
        this.age = age;
    }

    public int compare(Student o1, Student o2){
        return o1.age - o2.age;
    }
}

/*
class Student {
    int age;
    int classNumber;

    Student(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

}
*/




