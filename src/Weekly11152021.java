import java.util.Scanner;

public class Weekly11152021 {

	/*
	 * Java: 1) Write a function that returns true if a string consists of ascending
	 * or ascending AND consecutive numbers.
	 * 
	 * Examples ascending("232425") --> true // Consecutive numbers 23, 24, 25
	 * 
	 * ascending("2324256") --> false // No matter how this string is divided, the
	 * numbers are not consecutive.
	 * 
	 * ascending("444445") --> true // Consecutive numbers 444 and 445. Notes A
	 * number can consist of any number of digits, so long as the numbers are
	 * adjacent to each other, and the string has at least two of them.
	 * 
	 * 2) Create a function that takes an integer and outputs an n x n square solely
	 * consisting of the integer n.
	 * 
	 * Examples squarePatch(3) --> [ [3, 3, 3], [3, 3, 3], [3, 3, 3] ]
	 * 
	 * squarePatch(5) --> [ [5, 5, 5, 5, 5], [5, 5, 5, 5, 5], [5, 5, 5, 5, 5], [5,
	 * 5, 5, 5, 5], [5, 5, 5, 5, 5] ]
	 * 
	 * squarePatch(1) --> [ [1] ]
	 * 
	 * squarePatch(0) --> [] Notes n >= 0. If n = 0, return an empty array.
	 */

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("What task?\n1)Ascending numbers\n2)Integer square\n3)Quit");
			switch (in.nextInt()) {
			case 1:
				AscendingNumbers();
				break;
			case 2:
				IntegerSquare();
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Try again");
			}
		}
	}

	private static int isConsecutive(String str) {
		int start, length = str.length();
		
		for (int i=0; i<length/2; i++) {
			String new_str = str.substring(0, i+1);
			int num = Integer.parseInt(new_str);
			start = num;
			
			while (new_str.length() < length) {
				num++;
				new_str = new_str + String.valueOf(num);
			}
			if (new_str.equals(str)) return start;
		}
		return -1;
	}
	
	private static void AscendingNumbers() {
		System.out.println("Input string");
		in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println("Your string is: " + str);
		int start = isConsecutive(str);
		System.out.println((start != -1) ? "Yes" : "No");
	}
	
	private static void IntegerSquare() {
		// TODO Auto-generated method stub
		
	}

}
