package Sort;
import java.util.*;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른후 =");
        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른후 =");
        printStatus();

        goForward();
        System.out.println("= '앞으로' 버튼을 누른후 =");
        printStatus();

        goURL("5.구글");
        System.out.println("= '구글로 이동' 버튼을 누른후 =");
        printStatus();

    }

    public static void printStatus() {
        System.out.println("back:" + back);
        System.out.println("forward:" + forward);
        System.out.println("현재화면은  '" + back.peek() + "' 입니다");
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if (!forward.isEmpty()) {
            forward.clear();
        }
    }

    public static void goForward() {
        if (!forward.isEmpty()) {
            back.push(forward.pop());
        }
    }

    public static void goBack() {
        if (!back.isEmpty()) {
            forward.push(back.pop());
        }
    }

}
