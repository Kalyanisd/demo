public class ParameterizedConstructor {
	String name;
	int id;
	ParameterizedConstructor(String nm,int id) {
		name=nm;
		this.id=id;

	}
	public static void main(String[] args) {
		ParameterizedConstructor pc=new ParameterizedConstructor("dinga ", 420);
		System.out.println(pc.name+""+pc.id);
		ParameterizedConstructor pc1=new ParameterizedConstructor("guldu ", 20);
		System.out.println(pc1.name+""+pc1.id);
		
	}

}
