
public class StaticMethodsDemo {

	public static void main(String[] args) {
		
		System.out.println("Inside main");
        
		StaticMethodsDemo.method();
		
	}
	
	static void method(){
		
		System.out.println("Inside method");
	}
	
	static{
		
		System.out.println("Inside static block");
		StaticMethodsDemo.method();
		
	}

}
