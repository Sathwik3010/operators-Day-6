package day6;

import java.util.Scanner;

public class ASCIIValueFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char, number, special char");
		char ch = sc.next().charAt(0);
		int ASCII = (int)ch;
		System.out.println(ASCII);
		sc.close();
	}

}
