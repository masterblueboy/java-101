class Frog{
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		//more efficient way of concatenating than plus(+) sign
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
	}
	
	void printClassName(Object obj) {
		 System.out.println("The Object's class is " + obj.getClass().getName());
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1 = new Frog(7,"Rex");
		System.out.println(frog1);
		frog1.printClassName(frog1);

	}

}
