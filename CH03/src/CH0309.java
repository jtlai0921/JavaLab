import static java.lang.System.out;

public class CH0309 {
   public static void main(String[] args) {
      int[] number = {11, 22, 33, 44, 55, 66, 77, 88};
      int len = number.length;    //取得number陣列長度
      int[] numAry = new int[len];//空白陣列

      //方式一：for廻圈複製陣列
      out.print("for廻圈讀取並複製到numAry陣列\n"); 
      for(int j = 0; j < len; j++) {   
         numAry[j] = number[j];
         out.printf("%3d", numAry[j]);
      }

      //使用靜態方法System.arraycopy()
      int[] numAry2 = new int[len];
      System.arraycopy(number, 0, numAry2, 2, 6);
      out.println("\n使用arraycopy做陣列複製");
      for(int item : numAry2)
         out.printf("%3d", item);
   }
}