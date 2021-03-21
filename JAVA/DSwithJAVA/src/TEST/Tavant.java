package TEST;

public class Tavant {

	public static void main(String[] args) {
		
		int A =10;
		
		int b;
		
		try {
			b = 10/0;
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("Error Canot be divided by 0");
			e.printStackTrace();
		} 
		
		

	}

}
