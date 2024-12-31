
public class Dog {
	String name="puppy";
	double height=1.5;
	void sleep() {
		System.out.print(name+" slepping ");
	}
	void jump() {
		double height=7.0; 
		System.out.println(" is of height "+this.height+" and it jumps "+height+" height wall");
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sleep();
		d.jump();
		Dog d1=new Dog();
		d1.name="Shera";
		d1.height=2.5;
		System.out.println(d1.name);
		System.out.println(d1.height);
		d1.sleep();
		d1.jump();
		
		
		
		
	}
	

}
