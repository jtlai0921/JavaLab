package twoStack;
import java.util.*;

//第6章(二)-<Q3>以堆疊定義佇列
public class QueuewithStk<E>{
   private Stack<E> stk1 = new Stack<E>();
   private Stack<E> stk2 = new Stack<E>();

   //定義成員方法-新增項目到佇列
   public void Enqueue(E value){
      stk1.push(value);
   }

   //定義成員方法-從佇列移除項目
   public E Dequeue(){
      if (stk2.empty()) {
         while (! stk1.isEmpty())
            stk2.push(stk1.pop());
      }
      return stk2.pop();
   }
}
