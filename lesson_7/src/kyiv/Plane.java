package kyiv;

public abstract class Plane {
	int length;
	int width;
	int weight;
	
	
	public Plane(int length, int width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	void StartingEngines() {
		int time = 20+(int)Math.random()*(69);
		System.out.println(time);
	}
	void TakeoffAircraft() {
		double distance = Math.random()*1000;
		System.out.println(distance);
	}
	void LandingAircraft() {
		System.out.println("Plane is landing");
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
