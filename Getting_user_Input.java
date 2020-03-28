import java.util.Scanner;
public class Getting_user_Input {
	public static void main(String[] args) {
		// Create scanner object 
		Scanner input = new Scanner(System.in);
		Scanner input_int  = new Scanner(System.in);
		// output the prompt 
		System.out.println("Enter a line of text: ");
		
		// Wait  for the user to enter a line of text
		String line = input.nextLine();
		
		// Tell the what they entered.
		System.out.println("You entered: " + line );
		
		System.out.println("Enter an Integer");
		
		int value = input_int.nextInt();
		
		System.out.println("You entered :" + value);
		
		
	}
}
