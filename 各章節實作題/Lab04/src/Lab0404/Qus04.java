package Lab0404;
import static java.lang.System.*;

//�ĥ|�����D(�G)�AQ<4>
public class Qus04 {

	public static void main(String[] args) {
		SingleLinked list = new SingleLinked();
        int[] data = { 13, 64, 445, 37, 96, 513 };
        for (int item : data)
           list.addHead(item);
        out.println("��X�`�I");
        list.show();
        out.printf("�`�`�I : %d", list.size);
	}
}