
public class StringBuilderAndStringFormatting {
	public static void main(String[] args) {
		// Inefficent 
		String info = "";
		
		info +="My name is Bob.";
		info+= " ";
		info+= "I am a builder.";
		
		System.out.println(info);
		
		// Efficient way using StingBuilder
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Sue ");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb);
		
		StringBuilder s= new StringBuilder();
		s.append("My name is Samyak.")
		.append(" ")
		.append("I am a student");
		
		System.out.println(s.toString());
		
		
		
		// String Formatting  //
		System.out.println("Here is some text.\tThat was atab.\nThat was a new line");
		
		System.out.printf("Total cost %d; quantity is %d ",5,120);
		
		
		for (int i = 0 ; i<20; i++) {
			System.out.printf("%2d: %s\n",i," some text here");
			
		}
		
		System.out.printf("Total value %.2f",5.6876);
	}
}
