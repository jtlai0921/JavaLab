package hashSearch;
import java.util.Scanner;
import static java.lang.System.*;

//解決碰撞問題的開放位址法，也稱為線性探測
public class CH1007 {
   static final int PRIME = 13; //設定質數
   static int[] hash = new int[PRIME];  //儲存雜湊值的雜湊表

   public static void main(String[] args) {
      Scanner key = new Scanner(in);
      int[] number = {126, 432, 597, 459, 685, 106, 534,
            659, 343, 680, 308, 372};
      int j, item, target;

      out.println("--雜湊表--");
      //讀取陣列number產生雜湊表
      for (j = 0; j < number.length; j++)
         LinearProb(hash, number[j]);

      //輸出雜湊表
      for (j = 0; j < PRIME; j++){
         if (hash[j] != -1)
            out.printf("[%2d] = %3d%n", j, hash[j]);
         else
            out.print(j);
      }

      out.println("輸入欲搜尋的值，以空白鍵分隔，按-1結束-> ");
      while(true){
         item = key.nextInt();
         if (item != -1){
            target = searchHash(item);
            if (target != -1)
               out.printf("鍵值 [%d] 的索引 %2d", item, target);
            else
               out.printf("無此鍵值 [%d] !", item);
            out.println();
         }
         else
            break;
      }
      key.close();
   }

   //建立雜湊函數-採用運算式主體
   static int runHash(int num) {
      int result = num % PRIME;
      return result;
   }

  //定義靜態方法查找鍵值
   static int searchHash(int key){
      int pos = runHash(key);   //產生雜湊函數

      // 查找雜湊表的元素，有找到的話就回傳位置pos
      while (hash[pos] != key){
         pos = (pos + 1) % PRIME;
         //沒有找到就回傳-1
         if (hash[pos] == 0 || pos == runHash(key)) 
            return -1;
      }
     return pos;
   }

   //定義靜態方法將陣列元素放入雜湊表
   static void LinearProb(int[] hash, int key){
      int pos = runHash(key);   //產生雜湊函數
      //讀取陣列求得餘數，碰撞時以線性探測處理
      while (hash[pos] != 0)
         pos = (pos + 1) % PRIME;
      hash[pos] = key; //存入雜湊表
   }
}
