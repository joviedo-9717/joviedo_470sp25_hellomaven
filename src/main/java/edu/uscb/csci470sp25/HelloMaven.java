package edu.uscb.csci470sp25;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class HelloMaven {
	public static void main(String[] args) {
		String message = "    Hello, Maven!    ";
		System.out.println("Original: " + message);
		System.out.println("Trimmed: " + StringUtils.trim(message));

		Calculator myCalculator = new Calculator();

		Scanner input = new Scanner(System.in); // NOTE: Will need to ...

		System.out.print("Enter an integer: ");
		int num1 = input.nextInt();

		System.out.print("Enter another integer: ");
		int num2 = input.nextInt();

		System.out.println("The sum of " + num1 + " + " + num2 + " = " + myCalculator.add(num1, num2));

		input.close(); // it's a good idea to close the Scanner object (may help ...)
						// or use `...` to automatically close after use

	}
}
