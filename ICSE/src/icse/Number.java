package icse;

import java.util.Scanner;

//Page 117: 3
public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Natural logarithm of number:"+Math.log(num));
		System.out.println("Absolute value:"+Math.abs(num));
		System.out.println("Natural square root of number:"+Math.sqrt(num));
		System.out.println("Natural cube oot of number:"+Math.cbrt(num));
		System.out.println("Random number between 0 and 1:"+Math.random());
	}

}
