package kyiv;

public class circle {
	private double diametr;
	private double radius;
	
	
	circle (double diametr,double radius){
		this.diametr = diametr;
		this.radius = radius;
		
	}
	
	public void area() {
		System.out.println(3.14 * (diametr / 2) * (diametr / 2));
	}
	public void length() {
		System.out.println(2 * 3.14 * radius);
	}

	@Override
	public String toString() {
		return "circle [diametr=" + diametr + ", radius=" + radius + "]";
	}
	
}
