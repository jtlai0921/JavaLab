package infix;
import static java.lang.System.*;

//定義中序轉為後序式類別
public class InfixToPostfix {
   char[] stack = new char[20];
   int top = -1;//指向堆疊頂端的參考
   //將傳入中序運算式依據ICP、ISP規則轉為後序運算式
   public void varyPostfix(char[] infix, char[] postfix){
      int pos = 0, k = 0;

      while (infix[pos] != '\0'){
         if (infix[pos] == '('){   //左括號壓入STACK
            pushItem(stack, infix[pos]); //呼叫堆疊的PushT()方法
            pos++;
         }
         else if (infix[pos] == ')') {   //右括號從堆疊彈出
            while ((top != -1) && (stack[top] != '(')) {   //輸出運算式到左括號
               postfix[k] = popItem(stack); //把彈出的運算式儲存到後序運算式陣列
               k++;
            }
            if (top == -1){
               out.println("運算式不正確");
               break;
            }
            char token = popItem(stack); //移除左括號
            pos++;
         }
         //isDigit()判斷是否為十位數的數字，isLetter()判斷是否為字母
         else if ((Character.isDigit(infix[pos])) || 
               (Character.isLetter(infix[pos]))){
            postfix[k] = infix[pos];
                  k++;
            pos++;
         }
         else if (infix[pos] == '+' || infix[pos] == '-'
               || infix[pos] == '*' || infix[pos] == '/'
               || infix[pos] == '%'){
            //依運算子的優先權
            while ((top != -1) && (stack[top] != '(')
                  && (Priority(stack[top])
                  > Priority(infix[pos]))){
               postfix[k] = popItem(stack);
               k++;
            }
            pushItem(stack, infix[pos]);
            pos++;
         }
         else{
            out.println("運算式的字元不對");
            break;
         }
      }
      while ((top != -1) && (stack[top] != '(')){
         postfix[k] = popItem(stack);//彈出堆疊內其它運算子
         k++;
      }
      postfix[k] = '\0';
   }

   //依先乘除後加減的優先權
   public int Priority(char op){
      switch (op){
         case '*': case '/': case '%': return 3;
         case '+': return 2;
         case '-': return 1;
         default: return 0;
      }
   }

   //將項目壓入堆疊
   public void pushItem(char[] stack, char value){
      if (top == stack.length - 1)
         out.println("堆疊已滿");
      else{
         top++;
         stack[top] = value;
      }
   }

   //從堆疊彈出項目
   public char popItem(char[] stack){
      char val = ' ';
      if (top == -1)
         out.println("堆疊是空的！");
      else {
         val = stack[top];
         top--;
      }
      return val;
   }
}
