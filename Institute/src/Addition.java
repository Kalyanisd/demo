public class Addition {
	int add() {
		int a,b,c;
		a=10;b=20;
		c=a+b;
		return c;
		
	}
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	float add(float a,int b){
		float c=a+b;
		return c;
	}
	float add(int a,float b) {
		float c=a+b ;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		System.out.println(a.add());
		System.out.println(a.add(7, 9));
		System.out.println(a.add(4.8f,9));
		System.out.println(a.add(8, 54.0f));

	}

}
