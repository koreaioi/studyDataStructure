import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.*;

//심심해서 만들음
public class 회원정렬하기 {
    static ArrayList<Student> al = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String num = (st.nextToken());
            String pos = st.nextToken();
            String col = st.nextToken();
            String major = st.nextToken();
            int id = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String grade = (st.nextToken());
            al.add(new Student(num, pos, col, major, id, name, grade));
        }


        Collections.sort(al);

        for (Student s : al) {
            System.out.println(s.num + " " + s.Position + " " + s.college + " " + s.major + " "
                + s.id  +" " + s.name+" " + s.grade);
        }




    }

    static class Student implements Comparable<Student>{
        String num;
        String Position;
        String college;
        String major;
        int id;
        String name;
        String grade;

        public Student(String num, String position, String college, String major, int id, String name, String grade) {
            this.num = num;
            Position = position;
            this.college = college;
            this.major = major;
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        @Override
        public int compareTo(Student o) {


            return this.id - o.id;
        }
    }
}
