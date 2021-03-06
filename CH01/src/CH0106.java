import static java.lang.System.*;
import java.util.Scanner;

public class CH0106 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      out.print("請輸入欲查詢的月份-->");
      int month = input.nextInt();
      switch(month) {
         case 4: case 6: case 9: case 11:
            out.printf("%d 月有30天", month);
            break;
         case 2:
            out.printf("%d 月有28或 29天", month);
            break;
         default:
            out.printf("%d 月有31天", month);
            break;
      }
      input.close();
   }
}
