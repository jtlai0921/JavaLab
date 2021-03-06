package recursion;
import static java.lang.System.*;

//配合遞廻來撰寫費氏數列
public class CH0513 {
   public static void main(String[] args) {
      int num = 1;
      for (int n = 0; n <= 15; n++){
         out.printf("%2d -> %4d%n", n, Fibo(num));
         num++;
      }
   }

 //定義靜態方法來取得費氏數列
   public static int Fibo(int num){
      if ((num == 1) || (num == 2))
         return 1;                      //基本案例，終止遞廻
      else
         return Fibo(num - 1) + Fibo(num - 2);   //遞廻關係式
   }
}
