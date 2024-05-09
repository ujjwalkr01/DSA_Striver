package Pattern_Questions;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = 2 * n - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (j >= i && j <= m - i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
