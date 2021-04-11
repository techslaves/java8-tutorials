package arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        String [][] names = {
                {"Mr.", "Mrs.", "Ms"},
                {"Rahul","Ravi","Sita"}
        };
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][2]) ;
    }
}
