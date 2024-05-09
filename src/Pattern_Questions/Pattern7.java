package Pattern_Questions;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = 2 * n - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (j >= m - n - i && j <= m - n + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
