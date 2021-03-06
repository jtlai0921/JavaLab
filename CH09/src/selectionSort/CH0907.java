package selectionSort;
import static java.lang.System.*;

//使用選擇排序法做遞減排序
public class CH0907 {
   public static void main(String[] args) {
      int[] number = {145, 231, 10, 135, 18, 455, 77, 65, 33, 278};
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      selectSort(number, len);//呼叫靜態方法做排序

      out.println("\n** 選擇排序法  **");
      for (int j = 0; j < len; j++)
         out.printf("%-4d", number[j]);
   }

   //定義靜態方法進行選擇排序
   static void selectSort(int[] ary, int num){
      int j, max, k, tmp;
      for (j = 0; j < num - 1; j++){
         max = j;   //以第一個元素為最大值
         //依序找出陣列中最大值
         for (k = j + 1; k < num; k++){
            if (ary[k] > ary[max])
               max = k;
            //WriteLine($"[{k}] = {ary[k]}");
         }
         tmp = ary[max];
         ary[max] = ary[j];
         ary[j] = tmp;
      }
   }
}
