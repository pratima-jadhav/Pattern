package pattern;

public class pattern19 {

	public static void main(String[] args) {
		int row = 5;
		int star = 5;
		int space = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < space; j++) {

				System.out.print(" ");

			}
			for (int k = 0; k < star; k++) {
				System.out.print(" "+i);
			}
			space++;
			star--;
			System.out.println();
		}


	}

}
