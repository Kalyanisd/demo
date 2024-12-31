
public class Vegetable {
	String name;
	int qtny;
	void wash() {
		System.out.println("vegetables washed");
		
	}
	void chop() {
		System.out.println("vegetables choped");
		
	}
	public static void main(String[] args) {
		Vegetable v=new Vegetable();
		Potatoes p=new Potatoes();
		Onion o=new Onion();
		v.wash();
		v.chop();
		
		p.wash();
		p.chop();
		p.preparecurry();
		o.wash();
		o.chop();
		o.preparepakoda();
		
	}

}
class Potatoes extends Vegetable{
	String name="Aloo";
	int qnty=2;

	@Override
	void wash() {
		System.out.println(name+" washed");
		System.out.println(name);
		System.out.println(qnty);
		
		
	}
	void chop() {
		System.out.println(name+" choped");
	}
	void preparecurry() {
		System.out.println("curry prepared");
		
	}
	
	
}
class Onion extends Vegetable{
	String name="onion";
	int qnty=4;
	@Override
	void wash() {
	System.out.println(name+" washed");
	System.out.println(name);
	System.out.println(qtny);
	}
	void preparepakoda() {
		System.out.println("pakoda prepared");
	}
	
}