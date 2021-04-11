package classexamples;

import com.sun.org.apache.xpath.internal.Arg;

public class ArgumentConstuctorExample {
    /*
    If an argument constoctor is created Default constuctore is no more provided byt the calss automatically

     */
    int a;
    int c;

    /*public ArgumentConstuctorExample(){
        // Deafult Constructor
    }*/

    public ArgumentConstuctorExample(int x,int y){ //Argument constroctor
    a=x;
    c=y;
    }

    public void show(){
        System.out.println("Show ::: " + a);
        System.out.println("Show ::: " + c);
    }
    public static void main(String[] args) {
        ArgumentConstuctorExample argumentConstuctorExample = new ArgumentConstuctorExample(22,11);
        argumentConstuctorExample.show();
    }
}
