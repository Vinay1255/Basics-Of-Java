
public class Java_A16_Methods {
	
	static int logic(int x, int y) {
		int z;
		if(x>y) {
			z = x + y;
		}
		else {
			z = (x + y) * 5;
		} 
		return z;
	}
	
	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = logic(a, b);
//		Method invention using object creation
//		Java_A16A_Method obj = new Java_A16A_Method();	
//		c = obj.logic(a, b);
		
		int a1 = 2;
		int b1 = 1;
		int c1 = logic(a1, b1);
		
		
		
		System.out.println(c);
		System.out.println(c1);
		
	}
}
