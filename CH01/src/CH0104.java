import static java.lang.System.*;

//? : 三元運算子
public class CH0104 {
   public static void main(String[] args) {
      int score = 75;
      var result =(score >= 60) ? "Passing" : "Failed";
      out.println(result);
   }
}