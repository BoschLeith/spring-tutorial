package IOCTutorial;

public class MobilePhone {
	public static void main(String[] args) {

//		Class reference
		TMobile tMobile = new TMobile();
		tMobile.calling();
		tMobile.data();

//		Interface reference
		Carrier carrier = new Verizon();
		carrier.calling();
		carrier.data();
	}
}
