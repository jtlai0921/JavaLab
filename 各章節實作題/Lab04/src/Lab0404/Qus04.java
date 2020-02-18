package Lab0404;
import static java.lang.System.*;

//第四章習題(二)，Q<4>
public class Qus04 {

	public static void main(String[] args) {
		SingleLinked list = new SingleLinked();
        int[] data = { 13, 64, 445, 37, 96, 513 };
        for (int item : data)
           list.addHead(item);
        out.println("輸出節點");
        list.show();
        out.printf("總節點 : %d", list.size);
	}
}