import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

//第10章(二)-<Q2>
public class Lab1002 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      int[] number = { 117, 325, 513, 119, 89, 163, 749, 41, 213, 833 };

      //利用Array類別的Sort()方法將陣列排序
      Arrays.sort(number);
      //輸出排序後陣列
      for(int j = 0; j < number.length; j++)
         out.printf("[%2d] = %3d%n", j, number[j]);

      int find, target;

      out.print("輸入欲搜尋鍵值(41-833)-> ");
      find = input.nextInt();
      target = searchBinaryNonRecu(number, find);
      
      if (target == -1)
         out.printf("*** 無此鍵值 <%d>%n 索引 ***", find);
      else
         out.printf("鍵值  <%d> 的索引 %2d", number[target], target);
      input.close();
   }

   //定義靜態方法
   static int searchBinaryNonRecu(int[] ary, int key)   {
      int low = 0, mid;
      int high = ary.length - 1;
      
      while (low < high){
         mid = (low + high) / 2;  //取得陣列中間項
         
         if (key == ary[mid])     //找到鍵值就回傳
            return mid;
         else if (key < ary[mid]) //向前半部繼續查找
            high = mid - 1;
         else                     //向後半部繼續查找
            low = mid + 1;
      }
      return -1;
   }
}
