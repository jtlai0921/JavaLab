import java.util.Scanner;
import static java.lang.System.*;

//第1章(二)-<Q1> -- 以三元運算子判斷其大小
public class Lab0101 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      int num1, num2;
      out.print("輸入兩個數數，以空白鍵分隔 -> ");
      num1 = input.nextInt();//轉換為int型別
      num2 = input.nextInt();//轉換為int型別
      var ans = (num1 >= num2) ? num1 : num2;
      out.println("最大值：" + ans);
      input.close();
   }
}
