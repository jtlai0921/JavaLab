package CH0401;
import static java.lang.System.*;

public class Mobile {
   String color; //屬性-顏色
   float screen;;//屬性-螢幕大小

 //宣告方法-輸出手機顏色，CH0402範例
   public void getColor() {
      color = "Black";
      out.println("手機顏色-->" + color);
   }

   //宣告方法，CH0402範例
   public void getScreen(char opt) {
      switch(opt) {
         case 's':
            out.print("螢幕大小 = 9.0F");
            break;
         case 'm':
            out.print("螢幕大小 = 9.5F");
            break;
         default:
            out.print("螢幕大小 = 10.2F");
      }
   }
}
