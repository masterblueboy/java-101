
class Person{
	 private String name;
	 private int age;
	 
	 public Person() {
		 /* calling the 2nd constructor 
		  * --note that if you want to call a constructor to a another constructor, 
		  * It must be the first statement in the constructor;  
		 */
		 this(12, "Christian");
		 System.out.println("Name: " + name + "\nAge: " + age);
	 }
	 
	 public Person(int age, String name) {
		 this.name = name;
		 this.age = age;
		 
	 }
}


public class Machine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		

	}

}
