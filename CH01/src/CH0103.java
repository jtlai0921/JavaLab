import static java.lang.System.*;

public class CH0103 {
   public static void main(String[] args) {
      int score = 75;
      //if/esle敘述判斷分數，若大於60就給pass，否則就是fail
      if(score >= 60)
         out.println("Passing...");
      else
         out.println("Failed!!!");
   }
}
