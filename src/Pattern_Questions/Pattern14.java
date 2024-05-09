package Pattern_Questions;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		char start = (char) (int) ('A' + n - 1);
		for (int i = 0; i < n; i++) {
			char ch = start;
			for (int j = 0; j <= i; j++) {
				System.out.print(ch++);
			}
			start--;
			System.out.println();
		}

	}

}
