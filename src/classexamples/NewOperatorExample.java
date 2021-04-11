package classexamples;

import controlflowstatements.ForExample;

public class NewOperatorExample {

    /*
    New operator is ued to alocate memroy to an object.
    it is also known as dynamic memory allocation.
    Ex.
    <class-name> <object-name> = new <class-name>();
    NewOperatorExample obj = new NewOperatorExample();

     */
    NewOperatorExample newOperatorExample;
    ForExample forExample;
    ForExample obj1;
    NewOperatorExample obj2;

    public void show(){
        newOperatorExample = new NewOperatorExample();
        newOperatorExample.show1();
        System.out.println("Test");
    }

    public void show1(){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        NewOperatorExample obj; // reference to an object but memroy is not allocated
        obj = new NewOperatorExample();
        obj.show1();

    }

}
