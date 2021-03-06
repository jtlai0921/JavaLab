package multinomial;
import static java.lang.System.*;

public class CH0410 {
   public static void main(String[] args) {
      Node result = null;
      Polynomial poly = new Polynomial();
      out.println("多項式的表示：X^B");

      out.print("多項式一 > ");
      result = poly.showPoly1();
      poly.display(result);

      out.print("多項式二 > ");
      result = poly.showPoly2();
      poly.display(result);

      out.println("兩個多項式相加結果");
      result = poly.addItem();
      poly.display(result);
   }
}