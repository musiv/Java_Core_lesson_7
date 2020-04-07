package task1;

public class Application {
	public static void main(String[] args) {
		
		HourlyWorker H = new HourlyWorker("John",160,15);
		H.salary();
		FixedWorker F =new FixedWorker("Alex",2000);
		F.salary();
	}
}
