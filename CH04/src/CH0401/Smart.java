package CH0401;
import static java.lang.System.out;

public class Smart {
   String color; //屬性-顏色
   float screen;;//屬性-螢幕大小

   //建構函式-CH0403範例
   Smart(String tint, float size) {
      color = tint;
      screen = size;
   }

   //成員方法，CH0403範例
   public void display() {
      out.printf("手機顏色 -> %s%n螢幕大小 -> %.2f%n", color, screen);
   }
}
