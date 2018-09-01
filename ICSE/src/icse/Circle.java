package icse;

import java.util.Scanner;

//Page 117: 5

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter area of circle");
		double area=sc.nextDouble();
		double radius=Math.sqrt(((7*area)/22));
		System.out.println("Radius of the circle:"+radius);
	}
}
