import static java.lang.System.*;

public class CH0112 {
   String color; //屬性-顏色
   float screen;;//屬性-螢幕大小
   public static void main(String[] args) {
      CH0112 smart = new CH0112();
      smart.color = "Black";
      smart.screen = 10.5F;
      out.printf("手機顏色 %s%n", smart.color);
      out.printf("螢幕大小 %.1f吋", smart.screen);
   }
}
