package operators;

public class InstanceofDemo {

    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        Child child = new Child();

        obj1.test1();
        obj2.test1();
        child.test();
        child.test1();
        Child c = obj2 instanceof Child ? ((Child) obj2) : null;
        System.out.println(c.toString());
        boolean d = obj2 instanceof Child ? true : false;
        System.out.println(d);

        System.out.println("Obj1 is instance of Parent:" + (obj1 instanceof Parent));

        System.out.println("Obj1 is instance of Child:" + (obj1 instanceof Child));

        System.out.println("Obj2 is instance of Parent:" + (obj2 instanceof Parent));

        System.out.println("Obj2 is instance of Child:" + (obj2 instanceof Child));
    }



}

class Parent{
    public void test1(){

    }
}
class Child extends Parent{
    public void test(){

    }
}
