package CH0401;
import static java.lang.System.*;

public class CH0401 {
   public static void main(String[] args) {
      Mobile smart = new Mobile();
      smart.color = "Black";
      smart.screen = 9.5F;
      out.println("手機顏色-->" + smart.color);
      out.println("螢幕大小-->" + smart.screen);
   }
}
