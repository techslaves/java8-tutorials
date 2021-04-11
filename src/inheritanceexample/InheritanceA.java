package inheritanceexample;

public class InheritanceA {
    /*
    it is a mechanisam of deriving new class from an exisiting class
    new class is called subclass and exisiting class called super class
    -extends is a keyword to denote inheritance
    Types of Inheritnace
    -single level- A single class is derived from a single super class
    -Multi level -
    -Hierarchical
    -in inheriatance try to create an obejct of subclass but not of an super class
    Creating a superclass object is a bad programing practice
     */

    private int a;
    public void setA(int x){
        a=x;
    }
    public void showA(){
        System.out.println(a);
    }

}
