package recursion;

//未使用遞廻
public class CH0506 {
   public static void main(String[] args) {
      int N = 5;
      ShowNum(N);
   }

   //靜態方法以遞呼叫本身
   public static void ShowNum(int num){
      if (num > 0){
         System.out.printf("%3d", num);
         ShowNum(num - 1);
      }
   }
}
