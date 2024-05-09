package Pattern_Questions;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = 2 * n - 1;

		for (int i = 0; i < n; i++) {
			int k = 1;
			for (int j = 0; j <= m; j++) {

				if (j <= i) {
					System.out.print(k++);
				} else if (j >= m - i) {
					System.out.print(--k);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
