package kyiv;

public class Su27  extends Plane implements Options {
	private double maxSpeed;
	private String color;
	private AirplaneControl AirplaneControl = new AirplaneControl();
	
	public Su27(int length, int width, int weight, double maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
		
	}

	@Override
	public void TurboAcceleration() {
		double maxSpeed = Math.random();
		double speed = maxSpeed+maxSpeed*0.1;
		System.out.println(speed);
	}

	@Override
	public void StealthTechnology() {
		int time = (int)Math.random();
		System.out.println("You are invisible"+time);
	}

	@Override
	public void NuclearStrike() {
	int number = (int)Math.random()*10;
	System.out.println(number);
	}

	public void moveUp() {
		AirplaneControl.Up();
	}
	public void moveDown() {
		AirplaneControl.Down();
	}
	public void moveLeft() {
		AirplaneControl.Left();
	}
	public void moveRight() {
		AirplaneControl.Right();
	}
}
