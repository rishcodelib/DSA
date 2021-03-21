package TEST;

public class FCITechTestOne {

	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("IO Exception");
		} catch (RuntimeException e) {
			System.out.println("FileNotFoundException Exception");
		}

	}

}
