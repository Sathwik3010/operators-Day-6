package day6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/0);// exception
//		System.out.println(10.0/0);// infinity
//		System.out.println(0.0/0); // nan
		int a =10, b=20, c=30;
		String d = "codegnan";
		System.out.println(a + b + c + d);// 60codegnan
		System.out.println(b + c + d + a);// 60codegnan
		System.out.println(a + d + b + c );// 60codegnan
		System.out.println(d + a + b + c );// 60codegnan

		int x = 10;
		int y=x++;
		System.out.println(y);
		System.out.println(x);
		
		System.out.println(10&2);
		System.out.println(10|2);
		System.out.println(10^2);

//		System.out.println(10&&2);   bitwise is used for both int and boolean where as logical used for only boolean
		
		int i,k;
		i=10;
		k=i<0?-i:i;
		System.out.println("absolute value of "+i+" is " +k);
		i=-10;
		k=i<0?-i:i;
		System.out.println("absolute value of "+i+" is " +k);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		String result = (age>18)?"Eligible to vote":"not eligible to vote";
		System.out.println(result);
		sc.close();
		
	}
// even or odd
// leap year or not leap year
// number is positive or not
// number is divisible by 5 or not
}
