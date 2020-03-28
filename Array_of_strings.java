
public class Array_of_strings {
	public static void main(String[] args) {
	
		String[] words = new String[3];
		 words[0] ="hello";
		 words[1] =" to";
		 words[2] ="you";
		 
		System.out.println(words[2]);
		String[] fruits = {"apples","banana","pear","kiwi"};
		
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
	}

}
