package Android_Java_solution;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ch03_10 {
    public static void main(String[] args) {
        myClass c1 = new myClass(10);
        myClass c2 = new myClass(20);
        myClass c3 = new myClass(30);

        ArrayList<myClass> myList = new ArrayList<>();
        myList.add(c1);
        myList.add(c2);
        myList.add(c3);

        int hap = 0;

        for (int i = 0; i < myList.size(); i++) {
            hap+= myList.get(i).value;
        }
        System.out.println(hap);
    }

    static class myClass{
        int value;
        myClass(int value){
            this.value = value;
        }
    }
}

