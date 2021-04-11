package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // declared an array of integer
        int[] a;
        int b[];
        int[] c ={
                0,1,2
        };
        // allocates memmory of 3 integers
        a= new int[5];

        a[0]=2;
        a[1]=4;
        a[2]=6;
        //a[3]=8;

        System.out.println("0 index" + a[0]);
        System.out.println("1 index" + a[1]);
        System.out.println("2 index" + a[2]);
        System.out.println(c[0]);
        //System.out.println("3 index" + a[3]);
    }
}
