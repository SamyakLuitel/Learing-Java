class Thing{
	public String name ;
	public static String description;
	public final static int LUCKY_NUMBER =7;
	public static int count = 0;
	
	public Thing() {
		count++;
	}
	
	public void showName() {
		System.out.println(name);
	}
	
	public static void showInfo() {
		System.out.println("hello");
	}
}
public class StaticAndFinal {
	public static void main(String[] args) {
		
		System.out.println("before creating objects count is " + Thing.count);

	
	Thing thing1 = new Thing();
	Thing thing2 = new Thing();
	
	
	thing1.name = "Bob";
	thing2.name ="Sue";
	
	System.out.println(thing1.name);
	System.out.println(thing2.name);
	
	
	System.out.println("After creating the objects the count is " + Thing.count);
	thing1.description="this is 1";
	thing2.description = "this is 2";
	
	System.out.println(thing1.description);
	System.out.println(thing2.description);
	
	thing1.showName();
	Thing.showInfo();
	// to access the static method we don't need objects
	System.out.println("The lucky number is " + Thing.LUCKY_NUMBER);;
}
}