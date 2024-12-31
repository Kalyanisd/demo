import java.util.Scanner;
public class Rectangle extends Shape{
	float l,b;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter the length: ");
		l=sc.nextFloat();
		System.out.println("Enter the breadth: ");
		b=sc.nextFloat();
		
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		Area=l*b;
	}
	
	@Override
	void displayArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of rectangle " +Area);
		
	}

}
