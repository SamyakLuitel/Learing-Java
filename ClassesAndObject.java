class Person{
	// Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain 
	
	// 1.data
	
	//2. Subroutines (methods)
	 
	
	//Methods
	 void speak() {
		
		 System.out.println("My name is "+ name + " and I am "+ age +" years old");
		 
	
	
	 }
	 
	  void sayHello() {
		  System.out.println("Hello");
	  }
}
public class ClassesAndObject {
	public static void main(String[] args) {
		Person sam = new Person();
		
		sam.name ="Samyak Luitel";
		sam.age = 21;
		
		Person person2  = new Person();
		person2.name = "Savyata";
		person2.age = 13;
		
		System.out.println(sam.name);
		sam.speak();
		
		person2.sayHello();
	}
}
