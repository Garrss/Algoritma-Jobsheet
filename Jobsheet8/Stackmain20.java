package Jobsheet8;

public class Stackmain20 {

    public static void main(String[] args) {
        Stack20 stk = new Stack20(5);

        stk.push(15);
        stk.push(27);
        stk.push(13);

        stk.print();

        stk.push(11);
        stk.push(34);
        stk.pop();
        stk.peek();
        stk.print();
    }
}
