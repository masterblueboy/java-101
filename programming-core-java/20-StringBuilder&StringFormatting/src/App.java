
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This kind of setting up a String is inefficient
		String info = "";
		info += "My name is: Bob.";
		info += " ";
		info += "I am a builder";
		System.out.println(info);
		
		//Use StringBuilder or StringBuffer
		StringBuilder sb = new StringBuilder();
		
		sb.append("My name is: Leo.");
		sb.append(" ");
		sb.append("I am a lion tamer");
		System.out.println(sb);
		
		
		// -- Formatting -- //
		System.out.print("Here is some text\t.That was a tab.\nThat was a newline");
		System.out.println("More text.");
		
		// -- Formatting integers -- //
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		// -- Formatting floating point numbers -- //
		
		System.out.printf("Total value: %.2f\n", 5.769);
		System.out.printf("Total value: %-6.1f\n", 323.4232);
	}

}
