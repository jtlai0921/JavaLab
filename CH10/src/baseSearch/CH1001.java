package baseSearch;
import static java.lang.System.*;
import java.util.Scanner;

//循序搜尋
public class CH1001 {

   public static void main(String[] args) {
      Scanner key = new Scanner(in);
      int[] number = { 117, 325, 54, 19, 63, 113, 749, 25, 41, 213, 68, 92 };
      int target, search;
      out.print("輸入欲搜尋的值 -> ");
      search = key.nextInt();

      target = sequential(search, number); //呼叫函式做搜尋

      if (target != -1)
         out.printf("有找到，陣列索引 = %d", target);
      else
         out.println("無此搜尋值");
     key.close();

   }

   //定義靜態方法sequential()做線性搜尋 - 未排序資料
   public static int sequential(int key, int[] ary){
      for (int pos = 0; pos < ary.length; pos++){
         if (ary[pos] == key)  //比對陣列元素是否等於欲搜尋的鍵值
            return pos;        //回傳索引
      }
      return -1;               //沒有找到以0回傳
   }
}
