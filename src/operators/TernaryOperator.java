package operators;

public class TernaryOperator {

    public static void main(String[] args) {
        boolean value=true;
        boolean value1=false;

        boolean status;

         status = 2==2 ? value : value1;
        System.out.println(status);

        String str1="test";
        String testing = str1.equals("TEST") ? str1 : "TEST";
        System.out.println(testing);

        if(str1.equals("TEST")){
            System.out.println(str1);
        }else{
            System.out.println("TEST");
        }
    }

}
