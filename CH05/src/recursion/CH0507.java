package recursion;

//簡單的遞廻函式
public class CH0507 {
   public static void main(String[] args) {
      int total = 0;
      for (int j = 1; j < 11; j++){
         total += j;
         System.out.printf("%4d", total);
      }
   }
}
