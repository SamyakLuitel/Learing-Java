class Man{
	 private String name ;
	 private int age ;
	 
	 public void setName (String name) {
		 this.name = name ;
		 
	 }
	 
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
	 
	 public String getName() {
		 return name ;
	 }
	 
	 public int getAge() {
		 return age;
		 
	 }
	 
	 public void setInfo(String name, int age) {
		 setName(name);
		 setAge(age);
	 }
	 
}
public class SettersAndThis {
	public static void main(String[] args) {
			 Man man1 = new Man();
			 man1.setName("Sam");
			 man1.setAge(21);
			 System.out.println(man1.getName());
			 
	}
}
