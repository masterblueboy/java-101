/* Car is a child class of Machine class, wherein behaviors of Machine class 
	is also have in Car class */ 
public class Car extends Machine{
	
	@Override
	// overridden the method START from the Machine class
	public void start() {
		System.out.println("Car started");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
}
