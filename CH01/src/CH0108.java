import static java.lang.System.*;
import java.util.Scanner;

//while廻圈求取GCD
public class CH0108 {
   public static void main(String[] args) {
      int remain;//餘數
      out.print("輸入兩個整數，以空白鍵分隔-->");

      Scanner input = new Scanner(in);
      //取得除數
      int divisor = input.nextInt();
      //取得被除數
      int divided = input.nextInt();

      while (divided != 0){          //被除數不能為0
         remain = divisor % divided; //求取餘數
         divisor = divided; //被除數(divided)更換成除數(divisor)
         divided = remain;  //將前式所得餘數更換為除數(divisor)
      }
      out.printf("最大公因數：%d", divisor);
      input.close();
   }
}
