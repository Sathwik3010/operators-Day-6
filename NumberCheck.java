package day6;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		String result = (num>0)? " is Postive" : (num<0)? " is Negative": " is Zero";
		System.out.println(num + result);
		sc.close();
	}

}
