package inheritanceexample;

public class InheritanceB extends InheritanceA{
    /*

     */
    private int b;
    public void setB(int y){
       if (y<5)
       {
           System.out.println("number is small");
       }
       else
        b=y;
    }

    public void showB(){
        System.out.println(b);
    }
}
