
interface SampleInterface{
	void meth1();
	void meth2();
}

interface ChildSampleInterface extends SampleInterface{
	void meth3();
	void meth4();
}

class MySampleClass implements ChildSampleInterface{
	
	public void meth1() {
		System.out.println("Meth 1");
	}
	
	public void meth2() {
		System.out.println("Meth 2");
	}
	
	public void meth3() {
		System.out.println("Meth 3");
	}
	
	public void meth4() {
		System.out.println("Meth 4");
	}
}

public class Java_A30_InheritanceInterfaces {
	public static void main(String[] args) {
		
		MySampleClass obj = new MySampleClass();
		
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		
	}
}
