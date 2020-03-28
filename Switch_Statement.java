import java.util.Scanner;
public class Switch_Statement {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please Enter some command: ");
		
		String text = input.nextLine();
		
		switch(text) {
		
		case "start":
			System.out.println("Machine started");
			break;
			
		case "stop":
			System.out.println("The machine stopped");
			break;
		default:
			System.out.println("Command not recognized");
			break;
			
		
		}
		
	}

}
