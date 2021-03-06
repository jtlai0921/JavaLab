package hashSearch;
import static java.lang.System.*;

//建立雜湊表
public class CH1006 {
   public static void main(String[] args) {
      int[] number = { 4, 13, 21, 34, 42, 63 };
      runHash(number);
   }

   //定義靜態方法
   static void runHash(int[] ary){
      final int PRIME = 11;
      int pos, j;
      int[] hash = new int[PRIME];

      out.print("取得餘數：");
      //讀取陣列並以除法取得餘數
      for (j = 0; j < 6; j++){
         pos = ary[j] % PRIME;
         out.printf("%3d", pos);
         //餘數為索引，存入雜湊函數
         hash[pos] = ary[j];
      }
      out.println();

      //讀取雜湊函數
      for (pos = 0; pos < PRIME; pos++)
         out.printf("Hash[%2d] = %3d%n", pos, hash[pos]);
      out.println();
   }
}
