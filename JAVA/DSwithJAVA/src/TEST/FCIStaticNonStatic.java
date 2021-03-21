package TEST;

public class FCIStaticNonStatic {

	public static void main(String[] args) {
		StaticNonStatic sns = new StaticNonStatic();
		StaticNonStatic sns2 = new StaticNonStatic();
	}

	static {
		System.out.println("Inside staitc block");
	}

	{
		System.out.println("Non Static 1");
	}
	{
		System.out.println("Non Static 2");
	}

	static {
		System.out.println("static block 2");
	
	}

}​ ​ ​
