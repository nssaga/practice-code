package nssaga.beginner.e05control.e43forloop;

public class PyramidGeneration {
	public static void main(String[] args) {
		PyramidGenerator pyramid = new PyramidGenerator();

		pyramid.pyramid1_1();
		pyramid.pyramid1_2();

	}
}

class PyramidGenerator {

	void pyramid1_1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void pyramid1_2() {
		System.out.println("------pyramid1_2-------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}