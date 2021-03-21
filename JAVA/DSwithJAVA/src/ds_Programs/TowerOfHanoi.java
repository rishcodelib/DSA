package ds_Programs;

public class TowerOfHanoi {
	
//Steps to solve Tower of hanoi
	
	public static void main(String[] args) {
		int n = 4;
		toh(n, 'A', 'B', 'C');
	}

	private static void toh(int n, char from_rod, char to_rod, char aux_rod) {

		if (n == 1) {
			System.out.println("Move Disk 1 from Rod " + from_rod + " to rod " + to_rod);
			return;
		}
		toh(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("move disk " + n + from_rod + " to rod " + to_rod);
		toh(n - 1, aux_rod, to_rod, from_rod);
	}

}
