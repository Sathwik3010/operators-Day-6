package day6;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter even or odd number");
		
		int num = sc.nextInt();
		String result = (num%2 == 0)? " is Even" : " is Odd";
		System.out.println(num + result);
		sc.close();

	}

}
