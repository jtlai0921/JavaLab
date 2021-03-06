package interchangeSort;
import static java.lang.System.*;

//Shaker排序法做遞增排序
public class CH0902 {
   public static void main(String[] args) {
      int[] number = { 95, 27, 90, 514, 49, 82, 7, 13, 95, 321 };
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      shakerSort(number, len);//呼叫靜態方法

      out.println("\n** 雙向氣泡排序法 **");
      for (int j = 0; j < len; j++)
         out.printf("%-4d", number[j]);
   }

   //定義靜態方法
   static void shakerSort(int[] ary, int num){
      int first = 0, last = ary.length - 1;
      int shift = 0, j, tmp;

      while (first < last){ //shift為偏移量
         //由前向後走訪陣列找出最大值
         for (j = first; j < last; j++){
            if (ary[j] > ary[j + 1]){
               tmp = ary[j];
               ary[j] = ary[j + 1];
               ary[j + 1] = tmp;
               shift = j;
            }
            //print("[{j}] = {ary[j], 4}");
         }
         last = shift;

         //由後向前走訪陣列找出最小值
         for (j = last; j > first; j--){
            if (ary[j] < ary[j - 1]){
               tmp = ary[j];
               ary[j] = ary[j - 1];
               ary[j - 1] = tmp;
               shift = j;
            }
         }
         first = shift;
      }
   }
}
