package IOCTutorial;

public class TMobile implements Carrier {

	@Override
	public void calling() {
		System.out.println("Calling using T-Mobile");
	}

	@Override
	public void data() {
		System.out.println("Browsing using T-Mobile");
	}
}
