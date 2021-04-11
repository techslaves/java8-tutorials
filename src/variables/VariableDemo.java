package variables;

import java.sql.SQLOutput;

public class VariableDemo {
    //instance ,class ,local, pass as a parameter

    int a = 2; //instance variable, it will not have static keyword
    static int b = 3; // Class variable
    int s;

    public void test() {
        int x = 5; // local variable
        int y = x;
        s = x;
        System.out.println(x); //2
        a = 77;
        System.out.println(a); //2
        System.out.println(y); //2
        b = a + 11;
    }

    public void test1(String t) {
        System.out.println(b);
        System.out.println(s);
        System.out.println(t);
        System.out.println(a);
    }
    public void test2()
    {
        System.out.println(b);
    }
    public static void main(String[] args) {
        VariableDemo variableDemo = new VariableDemo();
        variableDemo.test();
        variableDemo.test1("5");
        VariableDemo variableDemo1= new VariableDemo();
        variableDemo1.test2();

    }
}
