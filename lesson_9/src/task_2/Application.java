package task_2;



public class Application {
	public static void main(String[] args) {
		
		Methods m = new Methods();
		double a,b;
		
		a = -8;
		b = -5;
		try {
			System.out.println(a + " + " + b + " = " + m.plus(a, b));
		} catch (Throwable e) {
			System.out.println("Exception intercepted: " + e.toString());
		}

		a = 15;
		b = 0;
		try {
			System.out.println(a + " - " + b + " = " + m.minus(a, b));
		} catch (Throwable e) {

			System.out.println("Exception intercepted: " + e.toString());
		}

		a = 0;
		b = 13;
		try {
			System.out.println(a + " * " + b + " = " + m.dobutok(a, b));
		} catch (Throwable e) {
			System.out.println("Exception intercepted: " + e.toString());
		}

		a = 4.7;
		b = 14;
		try {
			System.out.println(a + " / " + b + " = " + m.dilenya(a, b));
		} catch (Throwable e) {

			System.out.println("Exception intercepted: " + e.toString());

		}
		a = 0;
		b = 0;
		try {

			System.out.println(a + " + " + b + " = " + m.plus(a, b));

		} catch (Throwable e) {

			System.out.println("Перехоплено виключення: " + e.toString());

		}

	}
}

