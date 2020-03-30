class Robot {
	public void speak(String text) {
		System.out.println(text);
		
	}
	
	public void jump(int height) {
		System.out.println("jumping :"+height);
	}
	
	public void move (String direction , double distance) {
		System.out.println("Moving "+ distance + " meters in direction " + direction);
	}
}
public class MethodParameter {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("I am Sam");
		sam.jump(4);
		sam.move("North", 12);
		
	}
}
