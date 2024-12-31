import java.util.Scanner;
public class Circle extends Shape{
	float r;
	Scanner sc=new Scanner(System.in);
	
	void input() {
		System.out.println("Enter the inputs:" );
		 r=sc.nextFloat();
		
	}
	void calculateArea() {
		Area=3.14f*r*r;
		
	}
	
	@Override
	void displayArea() {
		// TODO Auto-generated method stub
		System.out.println("The area is: " +Area);
		
	}
}
