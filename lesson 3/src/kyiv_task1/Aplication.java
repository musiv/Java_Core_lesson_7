package kyiv_task1;

public class Aplication {
	public static void main (String []args) {
		Robot R = new Robot("I'm robot,i'm only working");
		System.out.println(R);
		CoffeRobot CR = new CoffeRobot("I'm cofferobot,i'm only making coffe");
		System.out.println(CR );
		RobotDancer RD = new RobotDancer("I'm robot,i'm only dansing");
		System.out.println(RD );
		RobotCoocker RC = new RobotCoocker("I'm robot,i'm only cooking");
		System.out.println(RC);
	}
	String [] array = {R,CR,RD,RC};
    for (int i = 0; i < array.length; i++) {
        array[i].work();
	}
}
