import static java.lang.System.*;

public class CH0105 {
   public static void main(String[] args) {
      int score = 78;
      if(score >= 90)        //條件一
         out.println("優");
      else if(score >= 80)   //條件二
         out.println("佳");
      else if(score >= 70)   //條件三
         out.println("好");
      else if(score >= 60)   //條件四
         out.println("可");
      else                   //上述條件皆不符合
         out.println("加油");
   }
}