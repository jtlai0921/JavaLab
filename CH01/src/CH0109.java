import static java.lang.System.*;
import java.util.Scanner;

//do/while廻圈
public class CH0109 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      int number;
      //do/while廻圈只執行了一次
      do {
         out.print("輸入1~10的整數來計算階乘--> ");
         number = input.nextInt();
      } while (number < 1 || number > 10);
      int limit = number, total = 1;
      //while廻圈
      while(limit > 0) {
         total *= limit;
         limit--;
      }
      out.printf("數值 %d! = %4d%n", number, total);
      input.close();
   }
}
