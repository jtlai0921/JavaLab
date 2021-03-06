package infix;
import static java.lang.System.*;
import java.util.Scanner;

//實作中序轉為後序式
public class CH0503 {
   public static void main(String[] args) {
      Scanner input = new Scanner(in);
      InfixToPostfix express = new InfixToPostfix();
      char[] infix = new char[20];
      char[] postfix = new char[20];
      out.print("輸入中序運算式--> ");
      String word = input.nextLine();
      for (int j = 0; j < word.length(); j++)
         infix[j] = word.charAt(j);
      express.varyPostfix(infix, postfix);
      out.println("--中序轉為後序運算式--");
      out.println(postfix);
      input.close();
   }
}
