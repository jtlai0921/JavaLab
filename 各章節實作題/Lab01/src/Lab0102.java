import java.util.Scanner;
import static java.lang.System.*;

//第1章(二)-<Q2> -- 判斷閏年的程式
public class Lab0102 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      int year;
      out.print("輸入西元紀年 -> ");
      year = input.nextInt();
      if (year % 400 == 0)
         out.printf("%d 閏年", year);
      else if (year % 100 == 0)
         out.printf("%d 非閏年", year);
      else if (year % 4 == 0)
         out.printf("%d 是閏年", year);
      else
         out.printf("%d 不是閏年", year);
      input.close();
   }
}
