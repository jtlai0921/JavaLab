package stack;
import static java.lang.System.*;

//以陣列結構實作堆疊
public class stackforArray {
 //屬性Name 儲存名稱, Index取得陣列位置 
   public String[] name = new String[5];
   private int index;
   stackforArray() {index = 0;}   //建構式

   //將元素從堆疊頂端壓入
   public void pushItem(String data){
      if (index <= name.length){
         name[index] = data;  //將元素存入堆疊內
         index++;  //向頂端移動
      }
      else
         out.println("堆疊已滿");
   }

   //將元素從堆疊頂端彈出
   public void popItem(){
      if (index > 0){
         index--;   //向底部移動
         out.printf("移除項目--> [%s]", name[index]);
      }
      else
         out.println("堆疊已空");
      out.println();
   }

   //輸出堆疊項目
   public void Display(){
      if (index <= 0)
         out.println("堆疊是空的");
      else{
         out.print("堆疊項目-->");
         for(int j = 0; j < index; j++)
            out.printf("%7s", name[j]);
      }
      out.println();
   }
}
