package kyiv_task3;

public class animal {
	private String name;
	private double speed;
	private int age;
	
	public animal(String name, double speed, int age) {
		super();
		this.name = name;
		this.speed = speed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "animal [name=" + name + ", speed=" + speed + ", age=" + age + "]";
	}
	
	
}
