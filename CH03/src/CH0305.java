import static java.lang.System.out;

public class CH0305 {
   public static void main(String[] args) {

      //宣告一個3X4二維陣列並初始化
      int[][] number = {{11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34}};
      int j, k;

      out.println("***** for *****");
      //使用一般for廻圈
      for(j = 0; j < number.length; j++){ //先讀列
         for (k = 0; k < number[j].length; k++) //再讀每列的欄元素
            out.printf("%3d", number[j][k]); 
         out.println();
      }

      out.println("\n--- 加強式for ---");
      for(int row[] : number) {   //產生列
         for(int elem : row)      //讀取每列的欄元素
            out.printf("%3d", elem);
         out.println();
      }
   }
}