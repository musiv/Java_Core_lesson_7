package kyiv_task2;

public class Application {
	public static void main (String[]args) {
		
		car C = new car("Ford",1975,new helm(10,"black"),new wheel(19,"metal"),new body("black","sedan"));
		System.out.println(C);
		
		helm h = new helm(15,"white");
		h.setColor("black");
		wheel w = new wheel(25,"sada");
		w.setHeight(50);
		body b = new body("orange","universal");
		b.setSize("universal");
		car c= new car("opel", 2005, h, w, b);
		System.out.println(c);
		
	
		
		
	}
}
