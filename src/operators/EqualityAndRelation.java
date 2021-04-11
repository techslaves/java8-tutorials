package operators;

public class EqualityAndRelation {
    /*
    == equal to
    != not equal to
    > greater than
    < less than
    >= greater than equal to
    <= less than equal to
     */

    public static void main(String[] args) {
        int value1=10;
        int value2=10;
        if(value1 == value2){
            System.out.println("Value1 " + value1 + " is equal to value2 " + value2);
        }else{
            System.out.println("Value1 is not equal to value2");
        }

        if (value1 != value2){
            System.out.println("Value1 is not equal to value2");
        }else{
            System.out.println("Value1 is equal to value2");
        }

        if(value1 >= value2){
            System.out.println("value 1 is grater than value 2");

        } else {
            System.out.println("value 2 is grater than value 1");
        }

        if(value1 <= value2){
            System.out.println("value 1 is less than value 2");

        } else {
            System.out.println("value 2 is less than value 1");
        }


        String str1= "test";
        String str2= "test1";

        if(str1==str2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }



}
