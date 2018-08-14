package hu.nyirszikszi.dectobin;

import java.util.Scanner;

public class DecToBin {
	private int dec;
	private String bin;
	
	public DecToBin() {
		System.out.print("Decimal number: ");
		dec = new Scanner(System.in).nextInt();
		convert(dec);
	}
	
	private void convert(int dec) {
		bin = Integer.toBinaryString(dec);
		System.out.println("Binary of " + dec + " is " + bin + ".");
	}
}