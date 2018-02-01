package july172016;

import java.util.Scanner;

public class Axe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());
		int dashEdgeLeft = 1;
		int dashEdgeRight = 2 * a - 3;
		int axLeft = 3 * a;
		int axMiddle = a - 1;
		int axRight = a - 1;

		printSymbol("-", 3 * a);
		printSymbol("*", 2);
		printSymbol("-", 2 * a - 2);
		System.out.println();

		for (int i = 0; i < a - 1; i++) {
			printSymbol("-", 3 * a);
			printSymbol("*", 1);
			printSymbol("-", dashEdgeLeft);
			printSymbol("*", 1);
			printSymbol("-", dashEdgeRight);
			dashEdgeLeft++;
			dashEdgeRight--;
			System.out.println();

		}
		for (int i = 0; i < a / 2; i++) {
			printSymbol("*", 3 * a);
			printSymbol("*", 1);
			printSymbol("-", a - 1);
			printSymbol("*", 1);
			printSymbol("-", a - 1);
			System.out.println();
		}
		for (int i = 0; i < a / 2 - 1; i++) {
			printSymbol("-", axLeft);
			printSymbol("*", 1);
			printSymbol("-", axMiddle);
			printSymbol("*", 1);
			printSymbol("-", axRight);
			axMiddle += 2;
			axRight--;
			axLeft--;
			System.out.println();
		}
		printSymbol("-", axLeft);
		printSymbol("*", 1);
		printSymbol("*", axMiddle);
		printSymbol("*", 1);
		printSymbol("-", axRight);
		System.out.println();

	}

	public static void printSymbol(String input, int count) {
		if (count == 0) {
			return;
		} else {
			System.out.print(input);
			printSymbol(input, --count);
		}
	}
}
