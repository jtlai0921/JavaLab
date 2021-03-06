package insertionSort;
import static java.lang.System.*;

//使用二元插入排序法做遞增排序
public class CH0905 {
   public static void main(String[] args) {
      int[] number = {78, 156, 43, 134, 37, 63, 24, 91};
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      binInsertSort(number, len);//呼叫靜態方法做排序

      out.println("\n** 二元插入排序法 **");
      for (int j = 0; j < len; j++)
         out.printf("%-4d", number[j]);
   }

   //定義靜態方法做排序
   static void binInsertSort(int[] ary, int num){
      int j, pos, key, first, last, mid;
      for (pos = 0; pos < num; pos++){
         key = ary[pos];//設欲插入元素為鍵值
         first = 0;
         last = pos - 1;

         //取得鍵值欲插入位置
         while (first <= last){
            mid = (first + last) / 2;  //算出位置
            //插入鍵值 < 目前鍵值，插到目前元素前方
            if (key < ary[mid])
               last = mid - 1;
            else //插入鍵值 > 目前鍵值，插到目前元素後方
               first = mid + 1;
         }

         for (j = pos; j > first; j--)//取得位置
            ary[j] = ary[j - 1];
         
         ary[first] = key; //插入新元素
      }
   }
}
