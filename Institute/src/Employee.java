public class Employee {
	String Ename;
	int id;
	Employee(String name,int id){
		this.Ename=name;
		this.id=id;
	}
	Employee(Employee ref){
		this(ref.Ename,ref.id);//this.Ename=ref.Ename;
		//this.id=ref.id;
		
	}
	public static void main(String[] args) {
		Employee e1=new Employee("dinga",23);
		System.out.println(e1.Ename+" "+e1.id);
		
		Employee e2=new Employee(e1);
		System.out.println(e2.Ename+" "+e2.id);
	}

	
}
