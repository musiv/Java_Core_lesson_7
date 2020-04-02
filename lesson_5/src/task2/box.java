package task2;

public class box {
	private int weight;
	private int height;
	private String color;
	private String type;
	
	public box(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}

	public box(int weight,int height,String color, String type) {
		this(weight, height);
		this.color = color;
		this.type = type;
	}

	@Override
	public String toString() {
		return "box [weight=" + weight + ", height=" + height + ", color=" + color + ", type=" + type + "]";
	}
	
	
	
}
