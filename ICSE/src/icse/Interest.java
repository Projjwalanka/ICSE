//
package icse;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sum, rate, time and type of interest(S for simple C for Complex)");
		double sum=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		char type=sc.next().charAt(0);
		double interest=0;
		if(type=='S'){
			interest=((sum*rate*time)/100);
		}
		else if(type=='C'){
			double tmp=Math.pow((1+(rate/100)),time);
			interest=sum*(tmp-1);
		}
		System.out.println("Sum:"+(sum+interest)+"\nInterest:"+interest);
	}

}
