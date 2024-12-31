import java.util.Scanner;
public class Tap {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in) ;
	int n=sc.nextInt();
	int m=sc.nextInt();
	int l=sc.nextInt();
	 if(n<m && l>m) {
		System.out.println(n);
	}
	else {
		System.out.println(m);
	}
	if (n>m && m>l) {
		System.out.println(l);
		
	} 

	
	
}
	
}
