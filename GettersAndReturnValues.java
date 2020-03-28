class Personality{
	String name;
	int age; 
	 void speak() {
		
		 System.out.println("My name is "+ name + " and I am "+ age +" years old");
		 
	
	
	 }
	 
	  void sayHello() {
		  System.out.println("Hello");
	  }
	  
	  int calculateYearsToRetirement() {
		  int yearsleft = 65-age;
		  //System.out.println(yearsleft);
		  return yearsleft;
	  }
}
public class GettersAndReturnValues {
	public static void main(String[] args) {
		
		Personality p1 = new Personality();
		p1.name = "Joe";
		p1.age = 56;
		p1.calculateYearsToRetirement();
		
		int time ;
		time = p1.calculateYearsToRetirement();
		System.out.println("the time remaining for retirement is " +time );
	}

}
