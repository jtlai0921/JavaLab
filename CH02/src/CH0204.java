import static java.lang.System.*;
import java.util.Date;
import java.text.DateFormat;

public class CH0204 {
   public static void main(String[] args) {
      Date thisday = new Date();//產生日期物件
      //%tF 輸出日期 %<tr 輸出以12小時為主的時間 
      out.printf("目前時間：%tF %<tr%n", thisday);
   }
}
