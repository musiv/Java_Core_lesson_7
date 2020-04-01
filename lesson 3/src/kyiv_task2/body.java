package kyiv_task2;

public class body {
	private String color;
	private String size;
	
	public body(String color, String size) {
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "body [color=" + color + ", size=" + size + "]";
	}
	
	public void changebody(String color) {
		this.color = color;
		switch (color) {
		
		case "black":
			color="black";
			break;
		case "white":
			color="white";
			break;
		default:
			color="brown";
	
		}
	}
}
