import static java.lang.System.*;

public class CH0202 {
   public static void main(String[] args) {
      int total = 0;
      int[] score = {98, 72, 63, 81};//一維陣列
      for(int j = 0; j < score.length; j++)
         total += score[j];
      out.println("總分 = " + total);
   }
}
