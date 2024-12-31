public class Stu {
		private int Age;
		private int Percentage;
		public void setage(int age){
			if(age>0) {
				Age=age;
			}
		}
		public void setPercentage(int per){
			if(per>35 || per<100) {
				Percentage=per;
			}
		}
		public int getAge() {
			return Age;
		}
		public int getPercentage() {
			return Percentage;
		}
		
		
	}
	class user{
		public static void main(String[] args) {
			
		Stu s=new Stu();
		s.setage(18);
		System.out.println(s.getAge());
		s.setPercentage(101);
		System.out.println(s.getPercentage());

		
		
		}
		
	}



	

