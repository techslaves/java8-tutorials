package methodoverridingexample;

public class MethodOverridingB extends MethodOverridingA{

    int b;
    void getB(int y){
        b=y;
    }

    void show(){
        System.out.println(b);
    }


}
