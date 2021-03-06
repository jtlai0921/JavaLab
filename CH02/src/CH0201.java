import java.util.Scanner;   //滙入「java.util.Scanner」套件
import static java.lang.System.*;

public class CH0201 {
   public static void main(String[] args) {
      //物件scan配合「System.in」來取得輸入資料
      Scanner scan = new Scanner(System.in);
      out.print("輸入兩個數值，以空白鍵分隔->");
      //nextInt()方法取得輸入的整數值
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      //以條件運算子判斷最大值
      int large = (num1 > num2) ? num1 : num2;
      out.println("最大值 = " + large);
      scan.close();//使用後須以close()方法關閉
   }
}
