package icse;

import java.util.Scanner;

//Question 8

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swaping.... a="+a+"  b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping.... a="+a+"  b="+b);
	}

}
