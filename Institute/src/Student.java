public class Student extends Human {
	int id;
	int std;
	Student(String name,int age,int id,int std){
		super(name,age);
		this.id=id;
		this.std=std;
	}
	void getdetails() {
		System.out.println(super.name+" "+super.age+" "+this.id+" "+this.std);
	}
	public static void main(String[] args) {
		Student s=new Student("dingi",21,450,9);
		System.out.println(s.name+" "+s.age+" "+s.id+" "+s.std);

		
	}
		
		
}

