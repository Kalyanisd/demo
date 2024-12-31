public class Roses {
	String colour;
	int price;
	String fragrance;
	Roses(String col,int pr,String frg){
		this.colour=col;
		this.price=pr;
		this.fragrance=frg;
	}
	Roses(Roses r1){
		this(r1.colour,r1.price,r1.fragrance);
	}
	 Roses(Roses r1, Roses r2) {
		 this.colour=r1.colour;
		 this.price=r2.price;	
		
	}
	 Roses(Roses r1,Roses r2,Roses r3){
		this(r1.colour,r2.price,r3.fragrance);
		 
	 }
	 
	public static void main(String[] args) {
		Roses r1=new Roses("Red",50,"odur");
		System.out.println(r1.colour+" roses of price "+r1.price+" and with fragrance "+r1.fragrance);
		
		Roses r2=new Roses(r1);
		r2.colour="white";
		r2.price=60;
		System.out.println(r2.colour+" roses of price "+r2.price+" and with fragrance "+r2.fragrance);
	
		Roses r3=new Roses(r1,r2);
		r3.colour="yellow";
		r3.price=80;
		r3.fragrance="sweet";
		System.out.println(r3.colour+" roses of price "+r3.price+" and with fragrance "+r3.fragrance);
		
		Roses r4=new Roses(r1,r2,r3);
		r4.colour="Black";
		r4.price=100;
		r4.fragrance="awesome";
		System.out.println(r4.colour+" roses of price "+r4.price+" and with fragrance "+r4.fragrance);
		
	}
	
	

	
}
