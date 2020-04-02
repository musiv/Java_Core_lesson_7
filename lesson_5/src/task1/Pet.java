package task1;

public abstract class Pet {
	private int weight;
	private int height;
	
	public Pet(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	abstract void voice();

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Pet [weight=" + weight + ", height=" + height + "]";
	}
	
	
}
