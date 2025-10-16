package day6;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		String result = (num%5==0)? " is divisible by 5" : "is not divisible 5";
		System.out.println(num + result);
		sc.close();
	}

}
