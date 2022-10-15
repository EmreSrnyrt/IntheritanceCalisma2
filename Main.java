package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		CostomerManager costomerManager = new CostomerManager();
		costomerManager.add(new EmailLogger());

	}

}
