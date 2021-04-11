package methodoverridingexample;

public class MethodOverridingA {

    /*
    - when superclass and subclass contains same name method - having same signature
    it is known as method-overriding
    - when this method is called with the help of subclass object then it will call
    its own method, therefore it is said that subclass is overrided the superclass method
    -Methods are overridden to support runtime polymorphisam as it decide at run time which
    method to call

    */

    int a;
    void getA(int x){
        a=x;
    }
    void show(){
        System.out.println(a);
    }

}
