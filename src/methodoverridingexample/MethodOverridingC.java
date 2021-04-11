package methodoverridingexample;

public class MethodOverridingC {

    public static void main(String[] args) {
        MethodOverridingB methodOverridingB = new MethodOverridingB();
        methodOverridingB.getB(10);
        methodOverridingB.getA(20);
        methodOverridingB.show();

    }
}
