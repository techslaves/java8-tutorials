package classexamples;

/*
when 2 or more functions are defined in a single class with same name but differnt number of arguments
    signature (number of argument  or types of argument)
    - this is a compile time polymorphisam (overloading) as compiler is able to understand at compile
     time which method to call

 */
public class FunctionOverloadingExample {
    void area(int a){
        System.out.println("Area of square is ::: " + a*a);
    }

    void area(float r){
        System.out.println("Area of circle ::: " + 3.14 * r * r);
    }

    void area(int a , int b){
        System.out.println("Area of rectangle ::: " + a*b);
    }

    void area(int g , float h){
        System.out.println("Area of rectangle ::: " + g+h);
    }

    public static void main(String[] args) {
        FunctionOverloadingExample functionOverloadingExample = new FunctionOverloadingExample();
        functionOverloadingExample.area(12, 12f);
        functionOverloadingExample.area(2f);
        functionOverloadingExample.area(2);
    }
}
