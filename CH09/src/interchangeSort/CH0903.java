package interchangeSort;
import static java.lang.System.*;

//使用快速排序法做遞增排序
public class CH0903 {
   public static void main(String[] args) {
      int[] number = {337, 141, 86, 254, 113, 67, 141, 92, 75, 21};
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      quickSort(number, 0, len - 1);//呼叫靜態方法

      out.println("\n** 快速排序法 **");
      for (int j = 0; j < len; j++)
         out.printf("%-4d", number[j]);
   }

   //定義靜態方法-排序
   static void quickSort(int[] ary, int first, int last){
      int pos; //取得pivot位置

      //陣列的首項first必須小於末項last才能排序
      if (first < last){
         pos = Division(ary, first, last); //分割陣列

         quickSort(ary, first, pos - 1);   //遞廻處理陣列前半部
         quickSort(ary, pos + 1, last);    //遞廻處理陣列後半部
      }
   }

   //定義靜態方法-分割陣列
   static int Division(int[] ary, int first, int last){
      int j, pivot, k, tmp;
      j = first;
      k = last;
      pivot = ary[first]; //設陣列第一個元素為基準點pivot

      while (j < k){
         // 設定pivot後, j > k && ary[k] >= pivot情形下 
         // 由左而右查找比pivot大的值, 比對後將兩者互換
         while (j < k && ary[k] >= pivot)
            k--;
         if (j < k){
            tmp = ary[j];
            ary[j] = ary[k];
            ary[k] = tmp;
         }

         //由右而左查找比pivot小的值
         while (j < k && ary[j] <= pivot)
            j++;
         if (j < k){
            tmp = ary[j];
            ary[j] = ary[k];
            ary[k] = tmp;
         }
      }
      return j;
   }
}
