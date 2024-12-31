public class B extends A{
@Override
	void show(int a,int b) {
	
		System.out.println("add:"+(a+b));
	}

	public static void main(String[] args) {
	B b=new B();
	b.show(5,5);
	}
}