public class ConOverloading {
	String name;
	int id;
	int age;
	ConOverloading(){
		
		System.out.println("Zero  parameterized constructor");
		
	}
	ConOverloading(String nm){
		this.name=nm;
		System.out.println("single parameterized constructor");
		
	}
	ConOverloading(String nm,int id){
		this.name=nm;
		this.id=id;
		
		System.out.println("double parameterized constructor");
		
	}
	ConOverloading(String nm,int id,int age){
		this.name=nm;
		this.id=id;
		this.age=age;
		System.out.println(" parameterized constructor");
		
	}
	public static void main(String[] args) {
		ConOverloading co=new ConOverloading("tillu");
		System.out.println(co.name+" "+co.id);
		
		ConOverloading co1=new ConOverloading("tillu",567);
		System.out.println(co1.name+" "+co1.id);
		
		ConOverloading co2=new ConOverloading("tillu",567,23);
		System.out.println(co2.name+" "+co2.id);
		
		ConOverloading co3=new ConOverloading();
		System.out.println(co3.name+" "+co3.id);
		
		
	}
	

}
