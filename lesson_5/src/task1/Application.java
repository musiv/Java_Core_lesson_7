package task1;

public class Application {
	public static void main(String[] args) {
	
		Cow c = new Cow(5,7);
		c.voice();
		Cat ct = new Cat(4,7);
		ct.voice();
		Dog d = new Dog(3,4);
		d.voice();
	}
}
