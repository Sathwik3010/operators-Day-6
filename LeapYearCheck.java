package day6;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		String result = ((year%4==0 && year%100!=0) || (year % 400==0))? " is Leap Year" : " is not a Leap Year";
		System.out.println(year + result);
		sc.close();
	}

}
