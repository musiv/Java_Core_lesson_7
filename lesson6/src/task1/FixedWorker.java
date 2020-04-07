package task1;

public class FixedWorker implements Salary{

	private String name;
	private int fixed;
	public FixedWorker(String name, int fixed) {
		super();
		this.name = name;
		this.fixed = fixed;
	}
	@Override
	public void salary() {
		System.out.println(name + fixed + "usd");
		
	}
	
	
}
