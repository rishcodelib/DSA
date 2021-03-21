package TEST;

class Tom {
	public static void something() {
		System.out.println("Inside the Tom class");
	}
}

public class OverridingMainMethod extends Tom {
	public static void main(String[] args) {
		Tom t = new OverridingMainMethod();
		t.something();
	}

	public static void something() {
		System.out.println("Inside the OverridingMainMethod class");
	}
}