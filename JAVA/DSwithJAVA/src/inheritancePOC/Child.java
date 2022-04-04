package inheritancePOC;

public class Child extends Parent {
	
	public static String Display() {
		return "Child display";
	}

	public static void main(String[] args) {

		Parent c = new Parent();

		System.out.println(Display());
	}

}
