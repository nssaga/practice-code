package nssaga.advance.e4control;

public class PyramidGeneration {
	public static void main(String[] args) {
		PyramidGenerator pyramid = new PyramidGenerator();

		pyramid.pyramid2_1();
		pyramid.pyramid3();

		pyramid.pyramid4();
		pyramid.pyramid5_Pascal();
		pyramid.pyramid6();

	}
}

class PyramidGenerator {

	
	void pyramid2_1() {
		System.out.println("------pyramid2_1-------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	void pyramid3() {
		System.out.println("------pyramid3-------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	void pyramid4() {
		System.out.println("------pyramid4-------");
		int count = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((count++) + " ");
			}
			System.out.println();
		}
	}

	void pyramid5_Pascal() {
		System.out.println("--pyramid5_Pascal---------");
		int rows = 5;
		int nextNumber;
		System.out.println("");

		for (int i = 0; i < rows; i++) {
			nextNumber = 1;

			// create (rows-i)*2 spaces, for initial spacing.
			for (int k = 0; k < (rows - i) * 2; k++)
				System.out.print(" ");

			for (int j = 0; j <= i; j++) {
				// %4d creates 4 space between number.
				System.out.format("%4d", nextNumber);
				nextNumber = nextNumber * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

	void pyramid6() {
		System.out.println("----------- Pyramid 6----------------");
		int j;
		int rows = 8;

		for (int i = 0; i < rows; i++) {
			for (j = 0; j < rows - i; j++) // for initial spacing.
				System.out.print(" ");

			for (int k = j ; k < rows; k++) // creates left half.
				System.out.print("*");

			for (int k = rows; k > j - 1; k--)// creates right half.
				System.out.print("*");

			System.out.println();
		}
	}

}