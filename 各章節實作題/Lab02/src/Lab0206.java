import java.util.Scanner;
import static java.lang.System.*;

//第2章-<2>Q6
public class Lab0206 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      int j, total = 1;
      out.print("輸入一個數值, 計算階乘-> ");
      int num = input.nextInt();

      for (j = 1; j <= num; j++){
         total *= j;
         out.printf("階乘 %d! = %3d%n", j, total);
      }
      input.close();
   }
}
