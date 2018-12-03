
class Thing{
	// the final variable cant be change the value once its declared
	public final static int LUCKY_NUMBER = 7;
	
	public String name;
	// static is  associated with class, instance variable, method cannot be include in a static
	public static String description;
	
	public void showName() {
		System.out.println("My name is: " + name);
	}
	
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing thing = new Thing();
		
		Thing.description = "I am a thing!";
		
		
		System.out.println(Thing.LUCKY_NUMBER);
		

	}

}
