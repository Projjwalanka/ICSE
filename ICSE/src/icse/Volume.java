//
package icse;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double vol=0;
		System.out.println("1.Cuboid\n2.Cylinder\n3.Cone\n4.Enter your choice:");
		int ch=sc.nextInt();
		switch(ch){
			case 1:
				System.out.println("Enter value of l,b,h");
				double l=sc.nextDouble();
				double b=sc.nextDouble();
				double h=sc.nextDouble();
				vol=l*b*h;
				System.out.println("Volume:"+vol);
			break;
			case 2:
				System.out.println("Enter value of r and h");
				double r=sc.nextDouble();
				h=sc.nextDouble();
				vol=3.14*r*r*h;
				System.out.println("Volume:"+vol);
			break;
			case 3:
				System.out.println("Enter value of r and h");
				r=sc.nextDouble();
				h=sc.nextDouble();
				vol=(3.14*r*r*h)/3;
				System.out.println("Volume:"+vol);
			break;
			default:
				System.out.println("nvalid choice");
		}
	}
}
