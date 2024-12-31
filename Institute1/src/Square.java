import java.util.Scanner;
public class Square extends Shape{
	float s,s1;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter the Side: ");
		s=sc.nextFloat();
		
		
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		Area=s*s;
	}
	
	@Override
	void displayArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of square "+Area);
		
	}

}
