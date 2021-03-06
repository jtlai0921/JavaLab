package recursion;
import java.util.Scanner;
import static java.lang.System.*;

//遞廻取得最大公倍數
public class CH0511 {
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
      //如果兩個數值相同就回傳其中的一個
      if (M == N)
         return M;               //基本案例
      else if (M > N)
         return GCD(M - N, N);   //遞廻關係式
      else
         return GCD(M, N - M);
   }
}
