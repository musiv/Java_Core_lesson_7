package kyiv_task2;

public class helm {
	private int diametr;
	private String color;
	
	public helm(int diametr, String color) {
		this.diametr = diametr;
		this.color = color;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "helm [diametr=" + diametr + ", color=" + color + "]";
	}
	
	public void changehelm(String color) {
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
