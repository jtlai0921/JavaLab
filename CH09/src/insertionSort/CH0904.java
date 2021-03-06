package insertionSort;
import static java.lang.System.*;

//使用謝耳排序法做遞增排序
public class CH0904 {
   public static void main(String[] args) {
      int[] number = {12, 135, 56, 43, 152, 458, 63, 32, 91};
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      insertSort(number, len - 1);//呼叫靜態方法

      out.println("\n** 插入排序法 **");
      for (int j = 0; j < len; j++)
         out.printf("%-4d", number[j]);
   }

   //定義靜態方法做排序
   static void insertSort(int[] ary, int num){
      int j, preid, key;
      for (j = 1; j <= num; j++){
         preid = j - 1; //比較時，取得前元素preid的位置
         key = ary[j];  //將欲插入元素設為鍵值

         /* 處理陣列中前、後項比大小的問題
                               欲插入位置的前元素 > 欲插入鍵值
                               變更索引後將項目向前移動 */
         while ((ary[preid] > key) && (preid >= 0)){//前元素向後移，挪出一個空位
            ary[preid + 1] = ary[preid];
            preid -= 1;
         }
         ary[preid + 1] = key; //鍵值插到空出的位置
      }
   }
}
