
import java.util.ArrayDeque;

public class Java_A48ArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
		ad1.add(5);
		ad1.add(56);
		ad1.add(6);
		ad1.addFirst(9);
		
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		
		
		
	}
}