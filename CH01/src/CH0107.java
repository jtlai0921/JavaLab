import static java.lang.System.*;

//for廻圈讀取數字並加總
public class CH0107 {
   public static void main(String[] args) {
      int total = 0;
      for(int i = 1; i <= 10; i++) {
         total += i;
      }
      out.printf("數字1+2+...+10 = %3d", total);
   }
}
