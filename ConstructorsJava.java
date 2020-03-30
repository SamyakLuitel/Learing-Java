class Machine{
	private String name;
	private int code;
	
	
	
	public Machine() {
		System.out.println("Consturctor Running");
		name  = "Arnie";
		
	}
	
	public Machine(String name) {
		System.out.println("Second construtor Running");
		this.name = name;
	}
	
	public Machine (String name , int code) {
		System.out.println("third constuctor running");
		this.name = name;
		this.code = code;
	}
	public Machine(int a) {
		this("Iron man",45);
		System.out.println("4 th constuctor ");
		
		
	}
}
public class ConstructorsJava {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Machine mach2 = new Machine("Sam");
		Machine mach3 = new Machine("RobCop",30);
		Machine mech4 = new Machine(1);

	}
}
