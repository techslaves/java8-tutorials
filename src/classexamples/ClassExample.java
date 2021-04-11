package classexamples;

public class ClassExample {
   public int a=1;
   private String v="abc"; // Member Variable or fields

   public void printingText(int a){ // int a is a parameter
      int b =20;     // local variable
      System.out.println("value" + a+b+1);
   }

   // - Method name should be a verb,adj, nouns
  // it start with lover case and goes as Camel case
  // only method name should be unique in the cass

   // it should not be a legal

   public String getV(){
      return v;
   }
}
