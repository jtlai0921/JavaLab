import static java.lang.System.*;
import java.util.Scanner;

public class CH0203 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      out.print("輸入三個數值，以空白鍵分隔->");
      //nextInt()方法取得輸入的整數值
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      int num3 = scan.nextInt();
      out.printf("合計 = %d", num1 + num2 + num3);
      scan.close();
   }
}
