package recursion;

//以遞廻處理數值的加總
public class CH0508 {
   public static void main(String[] args) {
      int result = TotalNums(1, 10);
      System.out.printf("1~10 累加總和: %d ", result);
   }

   //靜態方法-等差級數公式
   public static int TotalNums(int N1, int N2){
      int total = (N1 + N2) * 10 / 2;
      return total;
   }
}
