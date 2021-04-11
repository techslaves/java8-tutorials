package operators;

import java.util.ArrayList;
import java.util.List;

public class UnaryOperators {
    /*
    + unary plus operator
    - Unary minus operator
    ++ increment operator
    -- Decrement operator
    ! Logical operator
     */

    public static void main(String[] args) {
        int a=+1;
        System.out.println(a); //+1

        a--;
        System.out.println(a); //0

        a++;
        System.out.println(a); //1

        a=-a;
        System.out.println(a); //-1

        boolean status = true;
        if(a>0){
            System.out.println(!status);
        }else {
            System.out.println(status);
        }
        System.out.println(status);
        System.out.println(!status);

        int i=2;
        i++;
        System.out.println(i);

        ++i;
        System.out.println(i);

        List<String > list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        System.out.println(list.size());
        for (int j=0; j<list.size(); j++){
            System.out.println(list.get(j));
        }


    }

}
