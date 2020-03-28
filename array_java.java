import java.util.Scanner;
public class array_java {
	public static void main(String[] args) {
		//int value = 7;
		
		int[] values;
		
		values = new int[3];
		
		System.out.println(values[0]);
		
		values[0] =10;
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		int[] myvalues;
		myvalues = new int[10];
		
		System.out.println("enter numbers into array");
		for(int  i = 0;i< myvalues.length; i++) {
			Scanner input = new Scanner(System.in);
			myvalues[i] = input.nextInt();
			
			
		}

		
		System.out.println("Printing the numbers in Arrays");
		
		for (int i = 0; i< myvalues.length; i++) {
			System.out.println("the value of "+i +" th item is "+ myvalues[i]);
		}
	}
}
