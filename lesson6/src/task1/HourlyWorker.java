package task1;

public class HourlyWorker implements Salary {

	private String name;
	private int hours;
	private int payforhours;
	
	public HourlyWorker(String name, int hours,int payforhours) {
		super();
		this.name = name;
		this.hours = hours;
		this.payforhours= payforhours;
	}

	@Override
	public void salary() {
		System.out.println(name + hours*payforhours + "usd") ;
	}
	
	
}
