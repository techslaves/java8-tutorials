package classexamples;

public class FunctionOverlaodingExample2 {

     int area(int a){
         System.out.println("a is "+a);
        return a*a;
    }

   /* float area(float b){
       -Return type never play any role in Function overlaoding
       -Return type should remain the same then only its overlaoding
    }*/


    public static void main(String[] args) {
        FunctionOverlaodingExample2 functionOverlaodingExample2 = new FunctionOverlaodingExample2();
        int x =functionOverlaodingExample2.area2(4);
        System.out.println(x);
        FunctionOverloadingExample f2 = new FunctionOverloadingExample();
        f2.area(5);

    }

    int area2(int a){
        System.out.println("a is "+a);
        return a*2;
    }
}
