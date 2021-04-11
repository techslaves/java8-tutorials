package controlflowstatements;

public class IfThenElseExample {
    /*
    decision-making
            if then,
            if then-else
            switch
     Loopimg statements
            for
            while, do-while
      Branching Statements
             break
             continue
             return
     */

    public static void main(String[] args) {
        int x=5;
        if(x>3){
            System.out.println("X>3");
        }

        if(x==2){
            System.out.println("X==2");
        }else{
            System.out.println("X!=2");
        }

        if(x>1){
            System.out.println("X>1");
        }else if(x>2) {
            System.out.println("X>2");
        }else if(x==2){
            System.out.println("X<2");
        } else{
            System.out.println("exited");
        }
        System.out.println("End");
    }


}
