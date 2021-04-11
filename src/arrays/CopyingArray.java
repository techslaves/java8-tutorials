package arrays;

import java.util.Arrays;

public class CopyingArray {

    public static void main(String[] args) {

        char [] c ={
                '7','1','2'
        };

        char [] f = new char[3];
        System.arraycopy(c,1,f,0,2);
        System.out.println(f);

        char[] copyTo = java.util.Arrays.copyOfRange(c,0,1);
        System.out.println(copyTo);
        Arrays.sort(c);
        System.out.println(c);
        //System.out.println(x);
    }
}
