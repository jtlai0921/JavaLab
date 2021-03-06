package separateChaining;
import java.util.Scanner;
import static java.lang.System.*;

//實作分隔鏈結
public class CH1008 {
   public static void main(String[] args) {
      Scanner key = new Scanner(in);
      int[] number = {156, 681, 467, 633, 511, 100,
            57, 164, 472, 438, 445, 366, 118};
      int j, value, target = 0;

      Chaining list = new Chaining();

      out.print("----- 雜湊表 -----");
      //讀取陣列number產生雜湊表
      for (j = 0; j < number.length; j++)
         list.createHT(number[j]);
      list.display();

      out.println("\n輸入欲搜尋的值, 按<-1>結束-> ");
      while(true) {
         value = key.nextInt();
         if (value != -1){
            target = list.searchHash(value);
            if (target != -1)
               out.printf("鍵值 |%3d| 位於串列 [%2d] 的位置", value, target);
            else
               out.printf("無此搜尋值 %d", value);
            out.println();
         }
         else
            break;
      }
   }  
}
