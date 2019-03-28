
public class NonStaticMembersDemo {
	
	
	NonStaticMembersDemo(){
		
		System.out.println("Inside the constructor");
	}
	
	{
		
		System.out.println("Inside the non static block");
	}

	public static void main(String[] args) {
		
		System.out.println("Inside the main");
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();

	}
	
	static{
		
		System.out.println("Inside the static block");
	}

}
