package baseSearch;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

//二元搜尋法
public class CH1003 {
   public static void main(String[] args) {
      Scanner key = new Scanner(in);
      int target, find;
      int[] number = {
         5, 13, 18, 24, 35, 56, 89, 101, 118, 123, 157};

      out.print("輸入欲搜尋的值 -> ");
      find = key.nextInt();

      target = Searching(number, find, 0, 10);

      if (target != -1)
         out.printf("找到鍵值，索引:  %3d%n", target);
      else
         out.println("無此鍵值");

      //呼叫Array類別的BinarySearch()方法做搜尋
      int item = Arrays.binarySearch(number, find);
      out.printf("binarySearch()方法，搜尋值索引:  %3d%n", item);
      key.close();
   }

   //以靜態方法做二元搜尋
   static int Searching(int[] ary, int key, int low, int high){
      int mid;
      if (low <= high){
         //取得陣列中間項mid
         mid = (low + high) / 2;

         //中間項有符合者就回傳其值
         if (key == ary[mid])
            return mid;
         //K > Km 欲查找的key大於中間項，向右繼續
         else if (key > ary[mid]) {
            low = mid + 1;
            //以遞廻呼叫自身的方法
            return Searching(ary, key, low, high);
         }
         else //K < Km 欲查找的key大於中間項，向左繼續
            high = mid - 1;
         return Searching(ary, key, low, high);
      }
      return -1;
   }
}
