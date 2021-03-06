package baseSearch;
import static java.lang.System.*;
import java.util.Scanner;

//內插搜尋法
public class CH1004 {
   public static void main(String[] args) {
      Scanner key = new Scanner(in);
      int target, find;
      int[] number = {
         48, 54, 69, 74, 91, 113, 135, 147, 155, 163, 188};

      out.print("輸入欲搜尋的值 -> ");
      find = key.nextInt();

      target = searchInterpolation(number, find, 0, 10);

      if (target != -1)
         out.printf("找到鍵值，索引:  %3d%n", target);
      else
         out.println("無此鍵值");
      key.close();
   }

   //定義靜態方法
   static int searchInterpolation(int[] ary, int key, int low, int high){
      int point, mid;

      while (low <= high){
         //使用公式來預測搜尋值key的落點位置
         if ((ary[high] - ary[low]) != 0)
            point = (key - ary[low]) / (ary[high] - ary[low]);
         else
            point = 0;

         mid = low + (point * (high - low)); //求取中間項

         //情形一：key與中間項做比較，兩者相等，表示找到key
         if (key == ary[mid])
            return mid;
         //情形二：key與中間項做比較，搜尋值大於中間項，向右移動繼續比對
         else if (key > ary[mid])
            low = mid + 1;
         //情形三：key與中間項做比較，搜尋值小於中間項，向左邊移動
         else
            high = mid - 1;
      }
      return -1;
   }
}
