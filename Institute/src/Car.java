public class Car {
	String brand;
	String engine;
	Car(String br,String eng){
		this.brand=br;
		this.engine=eng;
	}
	public Car(Car c1) {
		this(c1.brand,c1.engine);
				
	}
	public Car(Car c1,Car c2) {
		this(c1.brand,c2.engine);
	}

	public static void main(String[] args) {
		Car c1=new Car("Audi","v8");
		System.out.println(c1.brand+" "+c1.engine);
		Car c2=new Car(c1);
		System.out.println(c2.brand+" "+c2.engine);
		c2.brand="BMW";
		c2.engine="v6";
		System.out.println(c2.brand+" "+c2.engine);
		
		Car c3=new Car(c1,c2);
		System.out.println(c3.brand+" "+c3.engine);
	}

	
}
