package IOCTutorial;

public class Verizon implements Carrier{

	@Override
	public void calling() {
		System.out.println("Calling using Verizon");
	}

	@Override
	public void data() {
		System.out.println("Browsing using Verizon");
	}
}
