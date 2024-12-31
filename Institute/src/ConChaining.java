
public class ConChaining {

	int a,b,c,d;
	 ConChaining(){	
		this.a=10;
		System.out.println("Zero  parameterized constructor");
	}
	 ConChaining(int b){
		this();
		this.b=b;
		System.out.println("single parameterized constructor");		
	}
	 ConChaining(int b,int c){
		this(b);
		this.c=c;
		System.out.println("double parameterized constructor");
		
	}
	 ConChaining(int b,int c,int d){
		this(b,c);
		this.d=d;
		System.out.println("parameterized constructor");
		
	}
	public static void main(String[] args) {
		ConChaining co=new ConChaining(9,8,7);
		System.out.println(co.a+" "+co.b+" "+co.c+" "+co.d);
		
		
	}
}
