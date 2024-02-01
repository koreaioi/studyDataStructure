package DataStructure;

interface Stack {
    boolean isEmpty();
    boolean isFull();

    void push(char item);

    char pop();

    char peek();

    void clear();

}

public class  MyStack implements Stack{
    private int top;
    private int stackSize;
    private char[] stackArr;



}
