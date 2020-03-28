import java.util.Scanner;

public class Do_while_loop {
	public static void main(String[] args) {
		int value = 0;
		Scanner scanner = new Scanner(System.in);
		do {

			System.out.println("Enter a number: ");

			value = scanner.nextInt();
		} while (value != 5);
		
		System.out.println("Got 5!");
	}
}
