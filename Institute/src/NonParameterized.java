public class NonParameterized {
	String name;
	int id;
	NonParameterized(){
		name="tillu";
		id=900;
		
	}
	public static void main(String[] args) {
		NonParameterized np=new NonParameterized();
		System.out.println(np.name+" "+np.id);
	}



}
