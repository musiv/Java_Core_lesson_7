package kyiv_task2;

public class wheel {
	private int height;
	private String material;
	
	public wheel(int height, String material) {
		this.height = height;
		this.material = material;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "wheel [height=" + height + ", material=" + material + "]";
	}
	
	public void changewheel(int height) {
		this.height=height;
	if (height<10) {
		material="metal";}
	else {
		material="plastic";}
	
	
	}
}
