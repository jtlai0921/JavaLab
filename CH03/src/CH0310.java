import static java.lang.System.out;
import java.util.Arrays;

//使用clone(), Arrays.copyOfRange()方法複製陣列

public class CH0310 {
   public static void main(String[] args) {
      int[] number = {11, 22, 33, 44, 55, 66, 77, 88};
      int len = number.length;    //取得number陣列長度
      int[] numAry3 = new int[len];//空白陣列

      numAry3 = number.clone();//複製陣列
      out.println("呼叫clon()方法複製陣列");
      for(int item : numAry3)
         out.printf("%3d", item);

      int[] numAry4 = new int[len];
      numAry4 = Arrays.copyOfRange(number, 2, 5);
      out.println("\n呼叫copyOfRange()方法複製指定範圍的陣列元素");
      for(int elem : numAry4)
         out.printf("%3d", elem);
   }
}
