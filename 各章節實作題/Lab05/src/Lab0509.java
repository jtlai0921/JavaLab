import static java.lang.System.out;

//第5章(二)-<Q9>以遞廻方式撰寫一個冪次方
public class Lab0509 {
   public static void main(String[] args) {
      out.printf("5^3 = %d", Power(5, 3));
   }

 //定義靜態方法計算冪次方
   public static int Power(int x , int num){
      if (num == 0)
         return 1;
      else
         return x * Power(x, num - 1);
   }
}
