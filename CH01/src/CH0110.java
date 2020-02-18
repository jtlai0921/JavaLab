import static java.lang.System.*;

//break, continue敘述
public class CH0110 {
   public static void main(String[] args) {
      int count, total = 0;

      //for廻圈配合continue, break敘述
      for (count = 0; count <= 20; count++){
         if (count % 2 == 0)//找出奇數
             continue;      //繼續廻圈 
         total += count;

         if (total > 60) //第二個if敘述
            break;       //中斷廻圈 
         out.printf("Count = %2d, Total = %2d%n", count, total);
      }
   }
}
