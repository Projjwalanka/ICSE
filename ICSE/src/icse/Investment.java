package icse;

import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sum, rate, time");
		double sum=sc.nextDouble();
		double rate=sc.nextDouble();
		double time=sc.nextDouble();
		double tmp=Math.pow((1+(rate/100)),1);
		double interest=sum*(tmp-1);
		System.out.println("Interest for first year:"+interest);
		sum=sum+interest;
		tmp=Math.pow((1+(rate/100)),1);
		interest=sum*(tmp-1);
		System.out.println("Interest for scond year:"+interest);
		sum=sum+interest;
		tmp=Math.pow((1+(rate/100)),1);
		interest=sum*(tmp-1);
		System.out.println("Interest for third year:"+interest);
	}

}
