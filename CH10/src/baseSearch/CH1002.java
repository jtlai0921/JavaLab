package baseSearch;
import static java.lang.System.*;
import java.util.Scanner;

//改善循序搜尋
public class CH1002 {
   public static void main(String[] args) {
      Scanner key = new Scanner(in);
      int[] number = 
         {19, 25, 41, 54, 63, 68, 92,
         113, 117, 213, 325, 749 };

      int target, search;
      out.print("輸人欲搜尋的值 -> ");
      search = key.nextInt();

      target = linearSearch(number, search);

      if (target != -1)
         out.printf("搜尋值的索引 : %2d", target);
      else
         out.println("無此鍵值");
      key.close();
   }

   //定義靜態方法-依輸入鍵值來找到它的位置(index)
   static int linearSearch(int[] ary, int key){
      //讀取陣列查找鍵值key
      for (int index = 0; index < ary.length; index++){
         //若陣列元素的值等於key, 回傳其位置
         if (ary[index] == key)
            return index;
         else if (ary[index] > key) //搜尋值大於目標值就停止查找
            return -1;
      }
      return -1;
   }
}
