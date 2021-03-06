import static java.lang.System.out;

//第9章(二)-<Q3> -- 使用插入排序法做遞減排序
public class Lab0903 {
   public static void main(String[] args){
      int[] number = {185, 625, 134, 47, 731, 125, 42, 416};
      int len = number.length;

      out.println("---- 排序前 ----");
      for (int item : number)
         out.printf("%-4d", item);
      out.println();

      Sorting(number, len - 1);//呼叫靜態方法進行氣泡排序

      out.println("\n** 插入排序法做遞減排序 **");
      for (int elem : number)
         out.printf("%-4d", elem);
   }

   //定義靜態方法做插入排序
   static void Sorting(int[] ary, int num)   {
      int j, preid, key;
      for (j = 1; j <= num; j++){   //移出一個空位來挪動元素
         key = ary[j];  //將欲插入元素設為鍵值
         preid = j;     //比較時，設前元素preid位置

         //處理陣列中前、後項比大小的問題，欲插入位置的前元素 <= 欲插入鍵值
         while (preid > 0 && ary[preid - 1] <= key){
            //值小者向後挪出一個空位
            ary[preid] = ary[preid - 1];
            //out.printf("%d = %d", preid, ary[preid]);//查看
            preid -= 1;
         }
         ary[preid] = key;//鍵值插到空出的位置
      }
   }
}
