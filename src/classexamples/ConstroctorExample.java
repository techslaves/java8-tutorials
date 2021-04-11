package classexamples;

public class ConstroctorExample {

    /*
    a constructor is a special method of a class that initisalises intanse variable when an object is created
    TYpes of constroctores are
    copy
    default
    parametarized argument/argument constor
    some of the practices of coonstunctor

    - Neme is same as the class name
    - it is called automatically when ojc is created
    - It is never inharited
    - it should be defined as public or default
    - It can not be static or final
     */

    int a;
    int b;
    int c;
    public ConstroctorExample(){ // this is a example of default constructor
        a=10;
        b=5;
    }

    public void show(){
        b=a+7;
        System.out.println(b);
    }
    public void ConstroctorExample(){
        b=a+1;
        c=b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        ConstroctorExample constroctorExample = new ConstroctorExample();
        constroctorExample.show();
       // constroctorExample.ConstroctorExample();
    }

}
