package kyiv;

public class Rectangle {
	private int weidth;
	private int height;

	
	Rectangle (){
		this.weidth = 3;
		this.height = 4;
	}
	
	Rectangle (int weidth,int height){
		this.height = height;
		this.weidth = weidth;
	}
	
	public void perimetr() {
		System.out.println( weidth*height);
	}
	public void perymetr() {
		System.out.println( (weidth+height)*2);
	}

	@Override
	public String toString() {
		return "Rectangle [weidth=" + weidth + ", height=" + height + "]";
	}
	
	
}