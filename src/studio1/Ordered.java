package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a number");
		int x = in.nextInt();
		System.out.println("Please input a number");
		int y = in.nextInt();
		System.out.println("Please input a number");
		int z = in.nextInt();
		 boolean isOrdered = (x>y && y>z) || (x<y && y<z);
System.out.print(isOrdered);
	
	}
}
