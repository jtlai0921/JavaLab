import static java.lang.System.*;

public class CH0205 {
   public static void main(String[] args) {
      int num1 = 25, num2 = 37;
      int add = calcAdd(num1, num2);
      int result = calcMulte(num1, num2);
      out.printf("  calcAdd(25, 37) = %4d%n", add);
      out.printf("calcMulte(25, 37) = %4d%n", result);
   }

   //靜態方法-兩個數值相加
   static int calcAdd(int x, int y){
      return x + y;
   }

   //靜態方法-兩個數值相乘
   static int calcMulte(int x, int y){
      return x * y;
   }
}
