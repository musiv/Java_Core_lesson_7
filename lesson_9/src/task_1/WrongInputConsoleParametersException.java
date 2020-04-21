package task_1;

public class WrongInputConsoleParametersException  extends Exception {
	private String incorrectData;

	public WrongInputConsoleParametersException(String incorrectData) {
		super(incorrectData);
		this.incorrectData = incorrectData;
	}

	public String getIncorrectData() {
		return incorrectData;
	}
}
