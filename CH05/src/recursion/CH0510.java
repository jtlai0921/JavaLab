package recursion;
import static java.lang.System.*;

//遞廻計算階乘
public class CH0510 {
   public static void main(String[] args) {
      for (int j = 1; j <= 5; j++)
         out.printf("%d! = %d%n", j, Factorial(j));
   }

 //定義靜態方法來計算階乘
   public static int Factorial(int N){
      int result;     //儲存階乘計算結果

      if (N == 0)
         result = 1;  //基本案例，終止遞廻
      else {          //若階乘為2(含)以上，呼叫自己的方法
         result = N * Factorial(N - 1);//以遞廻呼叫
         //out.printf("%d呼叫前一次，%d * Factorial %d - 1%n", N, N, N - 1);
      }
      return result;
   }
}
