package recursion;

//設定遞廻終止條件
public class CH0509 {
   public static void main(String[] args) {
      int result = TotalNums(5);
      System.out.printf("總和：%d", result);
   }

   //靜態方法-以遞廻方式呼叫
   public static int TotalNums(int num){
      int total;
      if (num == 1)
         total = 1; //終止遞廻
      else
         total = TotalNums(num - 1) + num;   //遞廻關係式
      return total;
   }
}
