package kyiv_task3;

public class application {

	public static void main(String[]args) {
		animal A =new animal("leopard",35.5,15);
		System.out.println("Назва тварини = " + A.getName()  +  ",Швидкість тварини = " + A.getSpeed()
		+"км/год"  + ",Вік тварини = " + A.getAge()+"років");
		
		A.setAge(24);
		A.setName("tiger");
		A.setSpeed(20.4);
		
		System.out.println("Назва тварини = " + A.getName()  +  ",Швидкість тварини = " + A.getSpeed()
		+"км/год"  + ",Вік тварини = " + A.getAge()+"років");
		
	}
}
