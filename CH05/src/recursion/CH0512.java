package recursion;
import java.util.Scanner;
import static java.lang.System.*;

//修改範例CH0511
public class CH0512 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      out.print("輸入兩個數，以空白鍵分隔 --> ");
      int num1 = input.nextInt();
      int num2 = input.nextInt();

      int result = GCD(num1, num2);
      out.printf("GCD = %d", result);
      input.close();
   }

   //定義靜態方法取得最大公因數
   public static int GCD(int M, int N){
      if (N == 0)
         //M % N 餘數為0，而M就是GCD
         return M;      //基本案例，終止遞廻
      else
         return GCD(N, M % N);  //遞廻關係式
   }
}
