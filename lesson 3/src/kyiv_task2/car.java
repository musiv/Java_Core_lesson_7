package kyiv_task2;

public class car {
	private String name;
	private int year;
	private helm helm;
	private wheel wheel;
	private body body;
	
	public car(String name, int year, kyiv_task2.helm helm, kyiv_task2.wheel wheel, kyiv_task2.body body) {
		super();
		this.name = name;
		this.year = year;
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
	}

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public helm getHelm() {
		return helm;
	}

	public void setHelm(helm helm) {
		this.helm = helm;
	}

	public  wheel getWheel() {
		return wheel;
	}

	public void setWheel(wheel wheel) {
		this.wheel = wheel;
	}

	public body getBody() {
		return body;
	}

	public void setBody(body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "car [name=" + name + ", year=" + year + ", helm=" + helm + ", wheel=" + wheel + ", body=" + body + "]";
	}
	
	
}


