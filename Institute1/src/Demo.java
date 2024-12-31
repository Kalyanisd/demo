
public class Demo {
	int a,b;
	static int x,y;
	Demo(){
		a=10;b=20;x=30;y=40;
		System.out.println("constructor executed");
	}
	{
		System.out.println("Instance block executed");
	
	}
	static{
		//access only static members not instance variables
		System.out.println("Static block executed");
	
	}
	public static void main(String[] args) {
		System.out.println("main method executed");
		
		Demo d1=new Demo();
		
	
		System.out.println(d1.a+" "+d1.b);
		System.out.println(d1.a+" "+d1.b);
		
		
	}

}
