package operators;

public class ConditionalOperators {
    /*
    && Conditional-AND
    || Conditional -OR

    true and false = false
    true and true = true
    false and false = false
    */
    public static void main(String[] args) {
        int value1=10;
        int value2=100;
        int value3 = 1000;
        int value4 =-1;

        if(value1== 10 && value2 >=25){
            System.out.println("Value1 " + value1 + "Value2 :" + value2);
        }

        if(value1== 10 && value2 >=250){
            System.out.println("Value1 " + value1 + "Value2 ::" + value2);
        }

        if(value1== 10 || value2 >=25){
            System.out.println("Value1 " + value1 + "Value2 :::" + value2);
        }

        if(value1== 10 || value2 >=250){
            System.out.println("Value1 " + value1 + "Value2 ::::" + value2);
        }
        if((value1== 10 && value2 >=250 && value3 ==1000 || value4 == -7)){
            System.out.println("Value1 " + value1 + "Value2 ::" + value2);
        }
    }
}
