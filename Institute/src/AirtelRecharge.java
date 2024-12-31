
public class AirtelRecharge {
	void recharge(long accno,String bankname) {
		System.out.println("transaction can be done through netbanking");
		
	}
	void recharge(float mno,double pwd) {
		System.out.println("transaction can be done through upi");
		
	}
	void recharge(int num,float pwd) {
		System.out.println("transaction can be done through wallet");
		
	}
	void recharge(String name,int amt) {
		System.out.println("transaction can be done through credit/debit");
		
	}
	public static void main(String[] args) {
		AirtelRecharge ar=new AirtelRecharge();
		ar.recharge(8765634559l,"sbi" );
		ar.recharge(9063798358f, 852258);
		ar.recharge(41741,852);
		ar.recharge("shiv",86932475);
	}
}
